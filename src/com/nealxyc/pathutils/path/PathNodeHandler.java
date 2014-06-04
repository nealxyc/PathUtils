package com.nealxyc.pathutils.path;

public interface PathNodeHandler {

	public boolean accepts(PathNode node);
	public void handle(PathNode node);
}
