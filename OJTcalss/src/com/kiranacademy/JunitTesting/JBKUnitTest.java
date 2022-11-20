package com.kiranacademy.JunitTesting;

import junit.framework.TestCase;

public class JBKUnitTest extends TestCase 
{
	
		JBKAdd a;
	
	    @Override
	    protected void setUp() throws Exception {
		System.out.println("in a setUp... before method call");
		a = new JBKAdd();
	    }
// testing addition method	    
	    public void testAdd() 
	    {
	    	System.out.println("inside testcase 1");
// assert equals method need (output,method as an argument).	    
	    	assertEquals(10,a.add(5,5)); //positive	
	    }
	    
// testing sub method	   
	    public void testSub() 
	    {
	    	System.out.println("inside testcase 2");
	    	assertEquals(3,a.sub(5,2)); // positive
	    }

// this method calling garbage collection internally
// beacause as we know when referece don't point object the it get called
// automatically for garbage collection.    
//	 variable a=null; 
	    @Override
	    protected void tearDown() throws Exception {
		System.out.println("in a tearDown after method call...");
		a = null;
	    }
	    
}
