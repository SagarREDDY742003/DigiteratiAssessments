package LibraryManagementSystem;

// Custom Exception class
public class BookNotFoundException extends Exception {
	public BookNotFoundException() {
		super("Error: The requested book was not found in the library.");
	}

}
