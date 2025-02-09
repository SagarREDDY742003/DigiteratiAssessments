package weekTwo.WarehouseInventoryManagementSystem;

// Custom Exception class
public class OutOfStockException extends Exception {
	public OutOfStockException(String message) {
		super(message);
	}
}
