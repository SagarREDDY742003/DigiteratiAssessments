package WarehouseInventoryManagementSystem;

public class Product {
	private String productID;
	private String name;
	private int quantity;
	private Location location;

	// Constructors, getters, and setters
	public Product(String productID, String name, int quantity, Location location) {
		super();
		this.productID = productID;
		this.name = name;
		this.quantity = quantity;
		this.location = location;
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public synchronized void reduceStock(int amount) throws OutOfStockException {
		if (quantity < amount)
			throw new OutOfStockException("Product " + name + " is out of stock!");
		quantity -= amount;
	}

}
