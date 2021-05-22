package com.pattern.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pattern.builder.CarDetails;
import com.pattern.builder.CarDetailsBuilder;
import com.pattern.factory.Car;
import com.pattern.factory.CarFactory;

@RestController
@RequestMapping("/cars")
public class AppController {

	@Autowired
	private CarFactory carFactory;
	
	@PostMapping("/{type}/{name}")
	public Car buyCar(@PathVariable String type, @PathVariable String name) {
		Car car = this.carFactory.createCar(type);
		car.setCarName(name);
		car.fillFuel();
		return car;
	}
	
	@GetMapping("")
	public List<CarDetails> getCars(){
		List<CarDetails> carDeatils = new ArrayList<>();
		carDeatils.add(new CarDetailsBuilder().setManufacturer("Honda").setModelName("City").setCountryName("India").buildCarDetails());
		carDeatils.add(new CarDetailsBuilder().setManufacturer("Hyundai").setModelName("i20").setCountryName("India").buildCarDetails());
		carDeatils.add(new CarDetailsBuilder().setManufacturer("Rolls Royce").setModelName("Phantom").setCountryName("UK").buildCarDetails());
		return carDeatils;
	}
	
}
