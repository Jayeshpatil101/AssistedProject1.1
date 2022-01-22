package com.java.training;
import java.io.*; 
import java.util.*; 

public class SynochronizationThread {
    public void send(String msg) 
    { 
        System.out.println("Sending\t"  + msg ); 
        try
        { 
            Thread.sleep(1000); 
        } 
        catch (Exception e) 
        { 
            System.out.println("Thread  interrupted."); 
        } 
        System.out.println("\n" + msg + "Sent"); 
    } 
} 
class ThreadedSend extends Thread 
{ 
    private String msg; 
    private Thread t; 
    SynochronizationThread  SynochronizationThread; 
    ThreadedSend(String m,  SynochronizationThread obj) 
    { 
        msg = m; 
        SynochronizationThread = obj; 
    } 
  
    public void run() 
    {  
        synchronized(SynochronizationThread) 
        { 
        	SynochronizationThread.send(msg); 
        } 
    } 
} 
class SyncDemo 
{ 
    private static final SynochronizationThread Raj = null;

	public static void main(String args[]) 
    { 
    	SynochronizationThread snd = new SynochronizationThread(); 
        ThreadedSend S1 = 
            new ThreadedSend( " Come " , Raj ); 
        ThreadedSend S2 = 
            new ThreadedSend( " Go" , Raj ); 
        S1.start(); 
        S2.start(); 
        try
        { 
            S1.join(); 
            S2.join(); 
        } 
        catch(Exception e) 
        { 
            System.out.println("Interrupted"); 
        } 
    } 
} 