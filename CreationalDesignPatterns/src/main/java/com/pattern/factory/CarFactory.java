package com.pattern.factory;

import org.springframework.stereotype.Component;

@Component
public class CarFactory {

	public Car createCar(String carType) {
		switch(carType.toLowerCase()) {
		case "sedan":
			return new Sedan();
		case "hatchback":
			return new HatchBack();
		default:
			throw new UnsupportedOperationException("Unknown Car type");
		}
	}
}
