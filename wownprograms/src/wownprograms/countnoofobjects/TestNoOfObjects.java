package wownprograms.countnoofobjects;

public class TestNoOfObjects {

	static int count =0;
	    // various types of constructors
	    public TestNoOfObjects()
	    {	count++;
	    }
	    public TestNoOfObjects(int n)
	    { this();}
	    public TestNoOfObjects(String s)
	    {  this();}
	    public TestNoOfObjects(float r)
	    {  this();}
	    public static void main(String args[])
	    {
	    	TestNoOfObjects t1 = new TestNoOfObjects();
	    	TestNoOfObjects t2 = new TestNoOfObjects(10);
	    	TestNoOfObjects t3 = new TestNoOfObjects("Java");
	    	TestNoOfObjects t4 = new TestNoOfObjects(2.2f);
	       
	
	        System.out.println("no of objectcount :"+count);
	    }
	}

