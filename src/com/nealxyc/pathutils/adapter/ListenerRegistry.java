package com.nealxyc.pathutils.adapter;

import com.nealxyc.pathutils.path.PathNode;

public interface ListenerRegistry {
	public ListenerRegistry register(PathNode node, PathListener listener);
	public PathGetListener getGetListener(PathNode node);
	public PathSetListener getSetListener(PathNode node);
}
