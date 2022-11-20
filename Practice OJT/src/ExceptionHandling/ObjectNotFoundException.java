package ExceptionHandling;

public class ObjectNotFoundException extends RuntimeException
{
	String msg;
	
	ObjectNotFoundException(String msg)
	{
		this.msg=msg;
		
	}
}
