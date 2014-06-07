package com.nealxyc.pathutils;

import java.util.Map;

import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import com.nealxyc.pathutils.adapter.PathAdapter;
import com.nealxyc.pathutils.adapter.PathSetListener;
import com.nealxyc.pathutils.path.PathNode;
import com.nealxyc.pathutils.path.PathNodeParser;
import com.nealxyc.pathutils.path.UnrecognizedPathException;

/**
 * 
 * @author Neal Xiong
 *
 * @param <T>
 */
public abstract class AbstractPaths {

	private Map<PathNode, PathSetListener> listeners ;
	private Map<Class<?>, PathAdapter> adapterMap = Maps.newHashMap();
	
	public <T, S> void put(T root, S path, Object value){
		Preconditions.checkNotNull(root);
		Preconditions.checkNotNull(path);
		
		PathNodeParser<S> parser = getPathNodeParser(root, path);
		PathAdapter adapter = getPathAdapter(root, path);
		Preconditions.checkNotNull(parser);
		Preconditions.checkNotNull(adapter);
		
		try {
			PathNode leaf = parser.parse(path) ;
			//TODO wire in listeners.
//			adapter.setValue(root, leaf, value);
		} catch (UnrecognizedPathException e) {
			//TODO 
			e.printStackTrace();
			return ;
		}
		
//		adapter.put(PathNode node, Object value);
	}
	
	protected abstract <T> PathNode getPathNode(T root, String path);
	
	protected abstract <T, S> PathNodeParser<S> getPathNodeParser(T root, S path);
	
	protected abstract <T> PathAdapter<? extends T> getPathAdapter(T root, Object path);
}
