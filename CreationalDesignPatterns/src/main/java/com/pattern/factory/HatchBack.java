package com.pattern.factory;

public class HatchBack implements Car{

	private String carName;
	private boolean fuelEmpty;
	
	public HatchBack() {
		super();
		this.fuelEmpty = true;
	}
	
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public boolean isFuelEmpty() {
		return fuelEmpty;
	}
	public void setFuelEmpty(boolean fuelEmpty) {
		this.fuelEmpty = fuelEmpty;
	}

	@Override
	public String getType() {
		return "HATCHBACK";
	}

	@Override
	public void fillFuel() {
		this.fuelEmpty = false;
		
	}
}
