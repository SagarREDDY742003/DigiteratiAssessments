package oops;

import utility.Constants;

public class ElectricCar extends Car {

	public int batteryRange;

	// constructor
	public ElectricCar(String make, String model, int year, int batteryRange) {
		super(make, model, year);
		this.batteryRange = batteryRange;

	}

	public int getBatteryRange() {
		return batteryRange;
	}

	public void setBatteryRange(int batteryRange) {
		this.batteryRange = batteryRange;
	}

	// chargeBattery method
	public void chargeBattery() {
		System.out.println(getMake() + " " + getModel() + " " + Constants.CHARGE_BATTERY);
	}

	// Overriding startEngine method
	@Override
	public void startEngine() {
		System.out.println(getMake() + " " + getModel() + " " + Constants.START_ELECTRIC_ENGINE);
	}

}
