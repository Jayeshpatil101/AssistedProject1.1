package com.java.training;

public class DiamondProm  {
	interface First 
	{  
	    default void show() 
	    { 
	        System.out.println("Default First"); 
	    } 
	} 
	interface Second 
	{  
	    default void show() 
	    { 
	        System.out.println("Default Second"); 
	    } 
	}  
	public class DiamondProm implements First, Second 
	{  
	    public void show() 
	    {  
	        First.super.show(); 
	        Second.super.show(); 
	    } 
	    public static void main(String args[]) 
	    { 
	    	DiamondProm  ob = new DiamondProm(); 
	        ob.show(); 
	    } 
	}






}
