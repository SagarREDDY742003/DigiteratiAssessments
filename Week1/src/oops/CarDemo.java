package oops;

public class CarDemo {

	public static void main(String[] args) {

		// Array of Car objects (both Car and ElectricCar)
		Car[] cars = { new Car("Toyota", "Camry", 2023), new ElectricCar("Tesla", "Model S", 2024, 400),
				new Car("Honda", "Civic", 2022), new ElectricCar("Nissan", "Leaf", 2023, 250) };

		// Loop through the array and call startEngine() on each object
		for (int i = 0; i < cars.length; i++) {
			cars[i].startEngine();
		}
	}

}
