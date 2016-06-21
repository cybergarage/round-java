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

public class Client
{
	private Cluster cluster = new Cluster();
	
	public Client() {
	}

	public boolean addNode(Node node) {
		return this.cluster.addNode(node);
	}
	
	public Node getHandleNode(String hashCode) {
		return this.cluster.getHandleNode(hashCode);
	}
}
