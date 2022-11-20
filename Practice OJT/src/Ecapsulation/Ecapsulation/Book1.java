package Ecapsulation.Ecapsulation;

public class Book1 {

	private int bookyearofpublish;
	private String bookname;
	private String authorname;

	Book1() {
	}

	public void setBookyearofpublish(int bookyearofpublish) {
		if(bookyearofpublish > 0)
		this.bookyearofpublish = bookyearofpublish;
// giving the value local variable and then that is equal to global variable
// we are updating the value
	}

	public int getBookyearofpublish() {
	
		return bookyearofpublish;
// we are getting the value	
		
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getBookname() {
		return bookname;

	}

	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}

	public String getAuthorname() {
		return authorname;

	}
}
