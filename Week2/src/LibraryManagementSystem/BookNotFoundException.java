package LibraryManagementSystem;

// Custom Exception class
public class BookNotFoundException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BookNotFoundException() {
		super("Error: The requested book was not found in the library.");
	}

}
