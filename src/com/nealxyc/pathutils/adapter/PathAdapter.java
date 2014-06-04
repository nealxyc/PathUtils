package com.nealxyc.pathutils.adapter;

import com.nealxyc.pathutils.path.PathNode;

public interface PathAdapter<T> {
	public void setValue(T root, PathNode node, Object value);
}
