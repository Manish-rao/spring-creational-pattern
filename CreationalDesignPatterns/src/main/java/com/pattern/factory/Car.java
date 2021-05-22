package com.pattern.factory;

public interface Car {

	void setCarName(String name);
	String getCarName();
	String getType();
	boolean isFuelEmpty();
	void fillFuel();
	
}
