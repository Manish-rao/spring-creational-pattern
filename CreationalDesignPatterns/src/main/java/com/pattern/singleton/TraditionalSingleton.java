package com.pattern.singleton;

public class TraditionalSingleton {
	
	private static TraditionalSingleton instance;
	
	private TraditionalSingleton() {
		super();
	}
	
	public static TraditionalSingleton getInstance() {
		if(null == instance) {
			synchronized (TraditionalSingleton.class) {
				if(null == instance) {
					instance = new TraditionalSingleton();
				}
			}
		}
		return instance;
	}
}
