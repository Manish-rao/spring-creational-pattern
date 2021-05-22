package com.pattern.builder;

public class CarDetailsBuilder {

	private String manufacturer;
	private String countryName;
	private String modelName;
	
	public CarDetailsBuilder setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
		return this;
	}
	public CarDetailsBuilder setCountryName(String countryName) {
		this.countryName = countryName;
		return this;
	}
	public CarDetailsBuilder setModelName(String modelName) {
		this.modelName = modelName;
		return this;
	}
	
	public CarDetails buildCarDetails() {
		return new CarDetails(manufacturer, countryName, modelName);
	}
	
}
