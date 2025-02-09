package WarehouseInventoryManagementSystem;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		// Initializing inventory
		InventoryManager inventoryManager = new InventoryManager();
		System.out.println("Inventory Initialized Successfully");

		// Loading products
		inventoryManager.addProduct(new Product("P001", "Laptop", 10, new Location(1, 2, 3)));
		inventoryManager.addProduct(new Product("P002", "Monitor", 5, new Location(2, 1, 1)));
		System.out.println("Products have been added successfully");

		List<String> order1Items = Arrays.asList("P001", "P002");
		List<String> order2Items = Arrays.asList("P001");

		inventoryManager.addOrder(new Order("O001", order1Items, Priority.EXPEDITED));
		inventoryManager.addOrder(new Order("O002", order2Items, Priority.STANDARD));
		System.out.println("Orders have been added successfully");

		// Simulate order processing
		inventoryManager.processOrders();

	}
}
