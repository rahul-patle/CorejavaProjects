package Classtype.bookshelf;

public class Test_Library_books_data {

	public static void main(String[] args) {
		int number_of_books;
		int history;
		int geography;
		int Maths;
		int bookadded_in_bookshelf;
		int bookRemoved_from_bookshelf;
		
		BookShelf bookshelf = new BookShelf(number_of_books = 5000 , history = 2000, geography = 1500, Maths = 1500);
		System.out.println("Library name:"+BookShelf.name_of_library);
		System.out.println(bookshelf);
		bookshelf.bookadded_in_bookshelf(history = 1000, geography = 2000, Maths = 300);
		System.out.println(bookshelf);
		bookshelf.bookRemoved_from_bookshelf(history = 100, geography = 200, Maths = 300);
		System.out.println(bookshelf);
	
	}

}
