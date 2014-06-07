package com.nealxyc.pathutils.adapter;

import com.nealxyc.pathutils.path.PathNode;
/**
 * Wraps a value object and the PathNode object it was associated with
 * @author Neal Xiong
 *
 */
public interface PathNodeValue {

	public Object getValue();
	public PathNode getPathNode();
}
