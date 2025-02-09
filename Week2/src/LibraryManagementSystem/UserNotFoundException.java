package LibraryManagementSystem;

public class UserNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserNotFoundException() {
		super("Error: The specified user does not exist in the system.");
	}

}
