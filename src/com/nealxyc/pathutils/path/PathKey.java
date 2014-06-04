package com.nealxyc.pathutils.path;

/**
 * Represent a path component. For example, "name" will be one of the components of "message.name.first_name".<br>
 * PathKey most likely will only contain a string but can have other types depends on the implementation.
 * @author Neal Xiong
 *
 */
public interface PathKey {
	/**
	 * Returns the formalized string representation.
	 * @return
	 */
	public String toString();
}
