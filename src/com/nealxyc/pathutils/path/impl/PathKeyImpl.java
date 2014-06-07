package com.nealxyc.pathutils.path.impl;

import java.util.Map;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.collect.Maps;
import com.nealxyc.pathutils.path.PathKey;

public class PathKeyImpl implements PathKey {
	private final String key ;
	public PathKeyImpl(String key){
		Preconditions.checkNotNull(key);
		this.key = key ;
	}
	
	public String toString(){
		return key ;
	}
	
	private static Map<String, PathKeyImpl> cache = Maps.newConcurrentMap();
	public static PathKey valueOf(String key){
		PathKeyImpl pk = cache.get(key);
		if(pk != null){
			return pk;
		}
		pk = new PathKeyImpl(key);
		cache.put(key, pk);
		return pk ;
	}

	@Override
	public int compareTo(PathKey o) {
		return key.compareTo(o.toString());
	}
}
