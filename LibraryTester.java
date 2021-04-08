
public class LibraryTester {

	public static void main(String[] args) {
		
		// Instantiate BookShelf objects
		BookShelf oBookShelf = new BookShelf();
		oBookShelf.setStartLetter('O');
		BookShelf tBookShelf = new BookShelf();
		tBookShelf.setStartLetter('T');
		
		// Print both
		System.out.println(oBookShelf);
		System.out.println(tBookShelf);
		
		// Instantiate Books
		Book kind = new Book("One of a Kind","Fantasy");
		Book betrayed = new Book("The Heart of the Betrayed","Romance");
		Book roses = new Book("The Vision of Roses","Crime");
		Book stars = new Book("Our Hill of Stars","Science Fiction");
		
		// Print Books
		System.out.println(kind);
		System.out.println(betrayed);
		System.out.println(roses);
		System.out.println(stars);
		
		// Add all Books to all shelves
		oBookShelf.AddBook(kind);
		oBookShelf.AddBook(betrayed);
		oBookShelf.AddBook(roses);
		oBookShelf.AddBook(stars);
		//
		tBookShelf.AddBook(kind);
		tBookShelf.AddBook(betrayed);
		tBookShelf.AddBook(roses);
		tBookShelf.AddBook(stars);
		
		// Print BookShelf objects, O then T
		System.out.println(oBookShelf);
		System.out.println(tBookShelf);
		
//		// Testing the program more, not part of assignment:
//		// Removing to make sure print statement works
//		System.out.println(oBookShelf.bSize); // 2
//		System.out.println(oBookShelf); // One of a Kind   Our Hill of Stars
//		//
//		oBookShelf.RemoveBook(stars);
//		System.out.println(oBookShelf.bSize); // 1
//		// Removing book of same starting letter but is not in list
//		oBookShelf.RemoveBook(stars);
//		System.out.println(oBookShelf.bSize); // 1
//		oBookShelf.RemoveBook(kind);
//		System.out.println(oBookShelf.bSize); // 0
//		//Removing to make sure size cannot be less than 0 books
//		oBookShelf.RemoveBook(kind);
//		System.out.println(oBookShelf.bSize); // 0
//		//
//		oBookShelf.AddBook(kind);
//		System.out.println(oBookShelf.bSize); //1
//		oBookShelf.AddBook(kind);
//		System.out.println(oBookShelf.bSize); //2
//		oBookShelf.AddBook(kind);
//		System.out.println(oBookShelf.bSize); //3
//		oBookShelf.AddBook(kind);
//		System.out.println(oBookShelf.bSize); //4
//		oBookShelf.AddBook(kind);
//		System.out.println(oBookShelf.bSize); //5
//		oBookShelf.AddBook(kind);
//		System.out.println(oBookShelf.bSize); //6
//		oBookShelf.AddBook(kind);
//		System.out.println(oBookShelf.bSize); //7
//		oBookShelf.AddBook(kind);
//		System.out.println(oBookShelf.bSize); //8
//		// Adding to make sure size cannot exceed 8 Books
//		oBookShelf.AddBook(kind);
//		System.out.println(oBookShelf.bSize); //8
//		// Remove incorrect starting letter
//		oBookShelf.RemoveBook(roses);
//		System.out.println(oBookShelf.bSize); // 8
	}

}
