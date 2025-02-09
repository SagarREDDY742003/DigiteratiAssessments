package LibraryManagementSystem;

public class LibraryManager extends LibrarySystem {

	// Detailed implementations for all abstract methods and interface methods
	public synchronized void borrowBook(String ISBN, String userID)
			throws BookNotFoundException, UserNotFoundException, MaxBooksAllowedException {
		User user = users.stream().filter(u -> u.getUserID().equals(userID)).findFirst()
				.orElseThrow(UserNotFoundException::new);
		Book book = books.stream().filter(b -> b.getISBN().equals(ISBN)).findFirst()
				.orElseThrow(BookNotFoundException::new);
		if (user.getBorrowedBooks().size() >= 5)
			throw new MaxBooksAllowedException();
		user.getBorrowedBooks().add(book);
		books.remove(book);

	}

	public synchronized void returnBook(String ISBN, String userID)
			throws BookNotFoundException, UserNotFoundException {
		User user = users.stream().filter(u -> u.getUserID().equals(userID)).findFirst()
				.orElseThrow(UserNotFoundException::new);
		Book book = user.getBorrowedBooks().stream().filter(b -> b.getISBN().equals(ISBN)).findFirst()
				.orElseThrow(BookNotFoundException::new);
		user.getBorrowedBooks().remove(book);
		books.add(book);
	}

	public void reserveBook(String ISBN, String userID) throws BookNotFoundException, UserNotFoundException {
		User user = users.stream().filter(u -> u.getUserID().equals(userID)).findFirst()
				.orElseThrow(UserNotFoundException::new);
		Book book = books.stream().filter(b -> b.getISBN().equals(ISBN)).findFirst()
				.orElseThrow(BookNotFoundException::new);

		System.out.println("User " + user.getName() + " has reserved the book: " + book.getTitle());
	}

	public Book searchBook(String title) {
		return books.stream().filter(b -> b.getTitle().equalsIgnoreCase(title)).findFirst().orElse(null);
	}

	public void addBook(Book book) {
		books.add(book);
	}

	public void addUser(User user) {
		users.add(user);
	}
}
