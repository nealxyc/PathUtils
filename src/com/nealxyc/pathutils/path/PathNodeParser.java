package com.nealxyc.pathutils.path;

/**
 * 
 * @author Neal Xiong
 *
 */
public interface PathNodeParser<S> {
	/**
	 * Parse a path (usually a string) into a single-branch tree of PathNode and returns the leaf node.
	 * @param path
	 * @return
	 * @throws UnrecognizedPathException
	 */
	public PathNode parse(S path) throws UnrecognizedPathException;
}
