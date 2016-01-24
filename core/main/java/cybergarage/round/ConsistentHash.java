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

public class ConsistentHash
{
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
