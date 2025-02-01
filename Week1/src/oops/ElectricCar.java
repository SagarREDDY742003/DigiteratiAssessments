package oops;
import utill.Constants;
public class ElectricCar extends Car {
	public String batteryRange;
	
	public ElectricCar(String make, String model, int year, String batteryRange) {
		super(make, model, year);
		this.batteryRange = batteryRange;
		
	}
	
	public void chargeBattery() {
		System.out.println(Constants.CHARGE_BATTERY);
	}

}
