
public class Book {
	// Declaring variables
	public String title;
	public String genre;
	
	// Parameterized constructor
	public Book(String title, String genre) {
		this.title = title;
		this.genre = genre;
	}

	// toString for printing
	@Override
	public String toString() {
		return title;
	}
}
