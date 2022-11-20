package Classtype.bookshelf;

public class BookShelf {

	int number_of_books, history, geography, Maths;

	static String name_of_library = "Shivalik";

	BookShelf(int a, int b, int c, int d) {
		number_of_books = a;
		history = b;
		geography = c;
		Maths = d;
	}

	public void bookadded_in_bookshelf(int historybook, int geographybook, int Mathsbook) {
		history = history + historybook;
		geography = geography + geographybook;
		Maths = Maths + Mathsbook;
		number_of_books =history+geography+Maths;

	}

	public void bookRemoved_from_bookshelf(int historybook, int geographybook, int Mathsbook) {
		history = history - historybook;
		geography = geography - geographybook;
		Maths = Maths - Mathsbook;
		number_of_books =history+geography+Maths;
	}

	public String toString() {

	return " number_of_books " + number_of_books + " history " + history + " geography " + geography + " Maths " + Maths;
	}

	public static void book_remove_and_add(BookShelf bookshelf1, BookShelf bookshelf2, int historybook,
			int geographybook, int Mathsbook) {
		// Addition of books in book shelf
		bookshelf1.history =bookshelf1. history + historybook;
		bookshelf1.geography = bookshelf1.geography + geographybook;
		bookshelf1.Maths =bookshelf1. Maths + Mathsbook;
		bookshelf2.number_of_books =bookshelf2.number_of_books-(bookshelf2.history+bookshelf2.geography+bookshelf2.Maths);

		
		// removing books from book shelf
		bookshelf2.history =bookshelf2. history - historybook;
		bookshelf2.geography = bookshelf2.geography - geographybook;
		bookshelf2.Maths =bookshelf2. Maths - Mathsbook;
		bookshelf2.number_of_books =bookshelf2.number_of_books-(bookshelf2.history+bookshelf2.geography+bookshelf2.Maths);
	}
}