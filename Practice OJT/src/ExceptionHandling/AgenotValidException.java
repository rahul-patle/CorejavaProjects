package ExceptionHandling;

public class AgenotValidException extends Exception {

	int waiting ;
	 AgenotValidException(int waiting) {
		this.waiting=waiting;
	}
}
