package com.nealxyc.pathutils.adapter;

import com.nealxyc.pathutils.path.PathNode;

public interface PathAdapter<T> {
	/**
	 * Returns true if this adapter is able to adapt the root object.
	 * @param root
	 * @return
	 */
	public boolean acceptsRoot(Object root);
//	public void setValue(T root, PathNode node, Object value);
	/**
	 * This method is responsible for returning the correct PathNodeAdapter for the given PathNode.
	 * @param root
	 * @param node
	 * @return
	 */
	public <R> PathNodeAdapter<R> getNodeAdapter(R root, PathNode node);
}
