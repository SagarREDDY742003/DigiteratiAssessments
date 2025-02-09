package weekTwo.WarehouseInventoryManagementSystem;

//Custom Exception Class

public class InvalidLocationException extends Exception {
	public InvalidLocationException(String message) {
		super(message);
	}
}
