/******************************************************************
*
* Round for Java
*
* Copyright (C) Satoshi Konno 2015
*
* This is licensed under BSD-style license, see file COPYING.
*
******************************************************************/

package org.cybergarage.round;

import java.net.*;
import java.io.*;
import org.json.*;
import java.util.HashMap;
import java.security.MessageDigest;
import java.io.ByteArrayOutputStream;

import org.cybergarage.round.rpc.*;

public class Node implements Comparable<Node>
{
	public static int DEFAULT_PORT = 38400;

	private String host;
	private int port;
	private JSONObject resObj;

	public Node(String host, int port)
	{
		this.host = host;
		this.port = port;
	}

	public String getId()
	{
		String seed = this.host + ":" + Integer.toString(this.port);
		return GetHashCode(seed);
	}

	public int compareTo(Node node) {
		String nodeId = node.getId();
		String thisId = this.getId();
		return thisId.compareTo(nodeId);
	}

	public boolean postMessage(JSONObject reqObj)
	{
		try {
			URL url = new URL("http", host, port, "/rpc");

			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			OutputStreamWriter out = new OutputStreamWriter(conn.getOutputStream());
			out.write(reqObj.toString());
			out.close();

			int statusCode = conn.getResponseCode();
			if (statusCode != 200)
				return false;

			InputStream in = conn.getInputStream();

			InputStreamReader reader = new InputStreamReader(in);
			StringBuilder builder = new StringBuilder();
			char[] buf = new char[1024];
			int nRead;
			while (0 <= (nRead = reader.read(buf))) {
				builder.append(buf, 0, nRead);
			}
			reader.close();

      String resStr = builder.toString();
      this.resObj  = new JSONObject(resStr);
		} catch (Exception e) {
			return false;
		}

		return true;
	}

	public JSONObject getResponse()
	{
		return this.resObj;
	}

	public boolean setRegistry(String method, String key, String value)
	{
		Request req = new Request();
		req.setMethod(method);

		HashMap<String,String> map = new HashMap<String,String>();
		map.put("key", key);
		map.put("val", value);
		req.setParams(map);

		return postMessage(req);
	}

  public boolean setRegistry(String key, String value)
  {
    return setRegistry("set_registry", key, value);
  }

	public boolean getRegistry(String method, String key)
	{
		Request req = new Request();
		req.setMethod(method);

		HashMap<String,String> map = new HashMap<String,String>();
		map.put("key", key);
		req.setParams(map);

		return postMessage(req);
	}

  public boolean getRegistry(String key)
  {
    return getRegistry("get_registry", key);
  }

	public boolean removeRegistry(String method, String key)
	{
		Request req = new Request();
		req.setMethod(method);

		HashMap<String,String> map = new HashMap<String,String>();
		map.put("key", key);
		req.setParams(map);

		return postMessage(req);
	}

  public boolean removeRegistry(String key)
  {
    return removeRegistry("remove_registry", key);
  }

  public final static String GetHashCode(String seed) {
    try {
      MessageDigest md = MessageDigest.getInstance("SHA-256");
      md.update(seed.getBytes());
      byte[] digest = md.digest();

      ByteArrayOutputStream buffer = new ByteArrayOutputStream();
	  PrintStream ps = new PrintStream(buffer);
      for (int i = 0; i < digest.length; i++) {
    	  ps.printf("%02x", (digest[i] & 0xff));    	  
      }
      return buffer.toString();
    } catch (java.security.NoSuchAlgorithmException e) {
      return "";
    }
  }
}
