package WarehouseInventoryManagementSystem;

import java.util.List;

public class Order implements Comparable<Order> {
	private String orderID;
	private List<String> productIDs;
	private Priority priority;

	// Constructor for Order Class
	public Order(String orderID, List<String> productIDs, Priority priority) {
		super();
		this.orderID = orderID;
		this.productIDs = productIDs;
		this.priority = priority;
	}

	// Getter methods
	public List<String> getProductIDs() {
		return productIDs;
	}

	public Priority getPriority() {
		return priority;
	}

	public int compareTo(Order o) {
		return this.priority.ordinal() - o.priority.ordinal();
	}

	public String toString() {
		return "Order " + orderID + " (" + priority + ")";
	}
}
