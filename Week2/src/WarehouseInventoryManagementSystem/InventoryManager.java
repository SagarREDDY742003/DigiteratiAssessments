package WarehouseInventoryManagementSystem;

import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InventoryManager {
	private Map<String, Product> products;
	private PriorityQueue<Order> orderQueue;

	// Constructor for InventoryManager
	public InventoryManager() {
		products = new ConcurrentHashMap<>();
		orderQueue = new PriorityQueue<>();
	}

	// Methods to add products, process orders, add orders, fulfill order
	public synchronized void addProduct(Product product) {

		// Logic to place product in correct location
		products.put(product.getProductID(), product);
	}

	public void processOrders() {
		// Multithreaded order processing
		ExecutorService executor = Executors.newFixedThreadPool(3);
		while (!orderQueue.isEmpty()) {
			Order order = orderQueue.poll();
			executor.execute(() -> fulfillOrder(order));
		}
		executor.shutdown();
	}

	public void addOrder(Order order) {
		orderQueue.add(order);
	}

	private void fulfillOrder(Order order) {
		try {
			System.out.println("Processing " + order);
			for (String productID : order.getProductIDs()) {
				Product product = products.get(productID);
				if (product == null)
					throw new InvalidLocationException("Product not found: " + productID);
				product.reduceStock(1);
			}
			System.out.println("Completed " + order);
		} catch (Exception e) {
			System.out.println("Error processing " + order + ": " + e.getMessage());
		}
	}

}
