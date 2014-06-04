package com.nealxyc.pathutils.path;

/**
 * Parse a path (usually a string) into a single-branch tree of PathNode and returns the leaf node.
 * @author Neal Xiong
 *
 */
public interface PathNodeParser<S> {
	public PathNode parse(S path) throws UnrecognizedPathException;
}
