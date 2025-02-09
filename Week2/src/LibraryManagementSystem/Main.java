package LibraryManagementSystem;

public class Main {
	public static void main(String[] args) {
		LibraryManager library = new LibraryManager();

		// Initializing library system, add users and books
		Book book = new Book("Java Programming", "Author A", "12345");
		User user = new User("Alice", "U1");
		library.addBook(book);
		library.addUser(user);

		Thread user1 = new Thread(() -> {
			try {
				library.borrowBook("12345", "U1");
				System.out.println("User: " + user.getName() + " Borrowed book: " + book.getTitle());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		});

		Thread user2 = new Thread(() -> {
			try {
				library.returnBook("12345", "U1");
				System.out.println("User: " + user.getName() + " Returned book: " + book.getTitle());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		});

		Thread user3 = new Thread(() -> {
			try {
				library.reserveBook("12345", "U1");
				System.out.println("User: " + user.getName() + " reserved book: " + book.getTitle());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		});

		user1.start();
		user2.start();
		user3.start();

	}
}
