package LibraryManagementSystem;

public class Book {
	private String title;
	private String author;
	private String ISBN;

	// Constructor for Book class
	public Book(String title, String author, String iSBN) {
		super();
		this.title = title;
		this.author = author;
		ISBN = iSBN;
	}

	// Getters and Setters method
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

}
