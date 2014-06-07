package com.nealxyc.pathutils.adapter;

import com.nealxyc.pathutils.path.PathNode;
/**
 * 
 * @author Neal Xiong
 *
 * @param <T> The type that this PathNodeAdapter is able to adapt. For example, PathNodeAdapter&lt;JSONObject&gt; is able to read(getPath)/write(setPath) on JSONObject
 */
public interface PathNodeAdapter<T> {
	public boolean accepts(T root, PathNode node);
	public boolean acceptsValue(T root, PathNode node, Object value);
	/**
	 * Creates the path on the root object. Optionally set its value to initial value (null)
	 * @param t
	 * @param node
	 */
	public void create(T root, PathNode node);
	public void setPath(T root, PathNode node, Object value);
	public Object getPath(T root, PathNode node);
}
