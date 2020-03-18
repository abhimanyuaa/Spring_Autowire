package com.demo.Beans;

import org.springframework.stereotype.Component;

@Component
public class Engine {

	private String ModelYear;

	public Engine() {
		super();
		System.out.println("2015");
		// TODO Auto-generated constructor stub
	}

	public Engine(String modelYear) {
		super();
		ModelYear = modelYear;
	}

	public String getModelYear() {
		return ModelYear;
	}

	public void setModelYear(String modelYear) {
		ModelYear = modelYear;
	}

	@Override
	public String toString() {
		return "Engine [ModelYear=" + ModelYear + "]";
	}

}
