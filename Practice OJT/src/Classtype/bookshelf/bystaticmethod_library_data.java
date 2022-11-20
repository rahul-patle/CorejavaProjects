package Classtype.bookshelf;

public class bystaticmethod_library_data {

	public static void main(String[] args) {
		int number_of_books;
		int history;
		int geography;
		int Maths;
		BookShelf bookshelf = new BookShelf (1000,121,121,21);
		bookshelf.bookadded_in_bookshelf(history=10, geography=10, Maths=10);
		System.out.println(bookshelf);
		bookshelf.bookRemoved_from_bookshelf(history=30, geography=130, Maths=10);
		System.out.println(bookshelf);

//*//***********************************************************************		
		BookShelf bookadd1= new BookShelf (number_of_books=4000,history=500,geography=3000,Maths=600);
		BookShelf bookadd2= new BookShelf (number_of_books=5000,history=500,geography=300,Maths=150);
		
		System.out.println("Library name:"+BookShelf.name_of_library);

		BookShelf.book_remove_and_add(bookadd1, bookadd2, history=50, geography=30, Maths=60);
		System.out.println("bookadded_in_bookshelf="+bookadd1);
		System.out.println("bookRemoved_from_bookshelf="+bookadd2);
	
	}
}
