package com.klef.jfsd.exam.model;

public @interface Column {

	String name();

	boolean nullable();

	boolean unique();

}
