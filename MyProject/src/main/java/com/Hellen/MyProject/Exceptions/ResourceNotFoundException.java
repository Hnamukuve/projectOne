package com.Hellen.MyProject.Exceptions;

public class ResourceNotFoundException extends RuntimeException {

	public ResourceNotFoundException() {
	    super("No resource found using the provided search parameters");
	}
	
}
