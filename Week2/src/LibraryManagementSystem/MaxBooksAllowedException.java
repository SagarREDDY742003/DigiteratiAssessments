package weekTwo.LibraryManagementSystem;

public class MaxBooksAllowedException extends Exception {
	public MaxBooksAllowedException() {
		super("Error: User has reached the maximum allowed borrowed books.");
	}
}
