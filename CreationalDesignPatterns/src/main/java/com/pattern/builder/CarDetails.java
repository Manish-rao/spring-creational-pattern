package com.pattern.builder;

public class CarDetails {

	private String manufacturer;
	private String countryName;
	private String modelName;
		
	public CarDetails() {
		super();
	}

	public CarDetails(String manufacturer, String countryName, String modelName) {
		super();
		this.manufacturer = manufacturer;
		this.countryName = countryName;
		this.modelName = modelName;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	
	
}
