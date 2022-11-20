package Ecapsulation.Ecapsulation;

public class Book1Test {
// example for getter setter method
	public static void main(String[] args) {
		Book1 book1 = new Book1();
		System.out.println(book1);
	
		//now you can call only positive numbers
		book1.setBookyearofpublish(1997);
		book1.setBookname("Rich Dad Poor Dad");
		book1.setAuthorname("Robert T.Kiyosaki and Sharon Lechter");

		System.out.println(book1.getBookyearofpublish());
		System.out.println(book1.getBookname());
		System.out.println(book1.getAuthorname());

	}
}
