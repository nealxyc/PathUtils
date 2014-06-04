package com.nealxyc.pathutils.path;

public class UnrecognizedPathException extends Exception {

	private static final long serialVersionUID = 1L;
	public UnrecognizedPathException(String path){
		super(String.format("Uncognized path string %s", path));
	}
}
