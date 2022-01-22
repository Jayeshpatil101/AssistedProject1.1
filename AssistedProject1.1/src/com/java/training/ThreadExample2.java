package com.java.training;

public class ThreadExample2 {
	{
	new NewThread("1st");  
    new NewThread("2nd");  
    new NewThread("3rd");  
    try {  
        Thread.sleep(8000);  
    } catch (InterruptedException excetion) {  
        System.out.println("Inturruption occurs in Main Thread");  
    }  
    System.out.println("We are exiting from Main Thread");  
}  
} 
