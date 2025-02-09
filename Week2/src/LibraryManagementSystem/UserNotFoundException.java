package weekTwo.LibraryManagementSystem;

public class UserNotFoundException extends Exception {

	public UserNotFoundException() {
		super("Error: The specified user does not exist in the system.");
	}

}
