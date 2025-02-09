package LibraryManagementSystem;

public class MaxBooksAllowedException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MaxBooksAllowedException() {
		super("Error: User has reached the maximum allowed borrowed books.");
	}
}
