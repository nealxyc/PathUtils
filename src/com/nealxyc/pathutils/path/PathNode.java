package com.nealxyc.pathutils.path;

import java.util.Map;

public interface PathNode {

	public PathNode getParent();
	public Map<PathKey, PathNode> getChildren();
	public PathNode getChildren(PathKey key);
	public PathKey getKey();
	/**
	 * Returns the formalized string representation of this PathNode.
	 * @return
	 */
	public String toString();
	//public PathNodeHandler getHandler();
}
