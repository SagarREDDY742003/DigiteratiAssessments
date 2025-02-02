package objectClass;

public class Main {
	public static void main(String[] args) {
		// Initialize objects
		User user1 = new User("Alice", 25);
		User user2 = new User("Alice", 25);
		SecondUser secondUser1 = new SecondUser("Alice", 25);
		SecondUser secondUser2 = new SecondUser("Alice", 25);

		// Print objects using toString
		System.out.println("User1: " + user1);
		System.out.println("User2: " + user2);
		System.out.println("SecondUser1: " + secondUser1);
		System.out.println("SecondUser2: " + secondUser2);

		// Compare objects using equals
		System.out.println("user1.equals(user2): " + user1.equals(user2));
		System.out.println("secondUser1.equals(secondUser2): " + secondUser1.equals(secondUser2));
	}
}
