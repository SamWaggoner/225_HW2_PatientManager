
import java.util.ArrayList;


public class BookShelf {
		
	// ArrayList of books
	ArrayList<Book> bShelf = new ArrayList<Book>();
	public int bSize = 0;
	public char startLetter;

	// Getter and Setter for startLetter
	public char getStartLetter() {
		return startLetter;
	}

	public void setStartLetter(char startLetter) {
		this.startLetter = startLetter;
	}
	
	// Method to add book if its title starts with startLetter
	public void AddBook(Book book) {
		if (book.title.charAt(0) == startLetter) {
			if (bShelf.size() < 8) {
				bShelf.add(book);
				bSize++;
			}
		}
		return;
	}
	
	// Method to remove a book, removes first appearance of a book
	public void RemoveBook(Book bookName) {
		if (bookName.title.charAt(0) == startLetter) {
			if (bShelf.indexOf(bookName) >= 0) {			// if you establish the index as an int first then try to remove it, it will make an error. This also doubles as a check that the list is not empty.
				bShelf.remove(bShelf.indexOf(bookName));
				bSize--;
			}
		}
	}

	// toString statement
	@Override
    public String toString() {
        if (bSize == 0)
            return "Empty";
        else {
            String printStatement = bShelf.get(0).title;
            for (int i = 1; i < bSize; i++) {
                printStatement = (printStatement) + "   " + bShelf.get(i).title;
            }
            return printStatement;
        }
	}
}