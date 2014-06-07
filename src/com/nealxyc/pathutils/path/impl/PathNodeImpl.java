package com.nealxyc.pathutils.path.impl;

import java.util.Map;
import java.util.TreeMap;

import com.google.common.collect.Maps;
import com.nealxyc.pathutils.path.PathKey;
import com.nealxyc.pathutils.path.PathNode;

public class PathNodeImpl implements PathNode{
	private PathKey key ;
	private PathNode parent ;//might be null;
	private TreeMap<PathKey, PathNode> children = Maps.newTreeMap();//sorted
	
	
	@Override
	public PathNode getParent() {
		return parent;
	}

	@Override
	public Map<PathKey, PathNode> getChildren() {
		return Maps.newTreeMap(children);
	}

	@Override
	public PathKey getKey() {
		return key;
	}

	@Override
	public PathNode getChildren(PathKey key) {
		return children.get(key);
	}

}
