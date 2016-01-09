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

	public Node [] getNodes() {
		return nodes.toArray();
	}

	public int size() {
		return nodes.size();
	}
}
