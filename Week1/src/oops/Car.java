package oops;

import utility.Constants;

public class Car {

	private String make;
	private String model;
	private int year;

	// constructor
	public Car(String make, String model, int year) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
	}

	// getters and setters
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String modal) {
		this.model = modal;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	// method to start engine
	public void startEngine() {
		System.out.println(make + " " + model + " " + Constants.START_ENGINE);
	}

}
