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

import java.util.Vector;

public class Cluster
{
	private Vector<Node> nodes = new Vector<Node>();

	public Cluster() {
	}

	public boolean addNode(Node node) {
		return this.nodes.add(node);
	}

	public Node [] getNodes() {
		Node[] nodeArray = new Node[size()];
		return nodes.toArray(nodeArray);
	}
	
	public Node getHandleNode(String key) {
		String keyCode = Node.GetHashCode(key);
		Node nodes[] = getNodes();
		int nodeCnt = size();
		for (int n=(nodeCnt-1); 0 < n; n--) {
			Node node = nodes[n];
			String nodeCode = node.getId();
			if (0 < nodeCode.compareTo(keyCode)) 
				return node;
		}
		return nodes[0];
	}
	
	public int size() {
		return nodes.size();
	}
}
