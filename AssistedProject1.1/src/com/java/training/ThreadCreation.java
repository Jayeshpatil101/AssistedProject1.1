package com.java.training;

public class ThreadCreation extends Thread {
	public void run()
 	{
  		System.out.println("concurrent thread started running..");
}
 	public static void main( String args[] )
 	{
  		ThreadCreation mt = new  ThreadCreation();
  		mt.start();
 	}
}
