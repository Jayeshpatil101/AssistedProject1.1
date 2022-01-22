package com.java.training;

public class Throw {
	public static void main(String[] args)
    {

        int a=12,b=0,rs;

        try
        {
            if(b==0)        
                throw(new ArithmeticException("Can't divide by zero."));
            else
            {
                rs = a / b;
                System.out.print("\n\tThe result is : " + rs);
            }
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\n\tError : " + Ex.getMessage());
        }

        System.out.print("\n\tEnd of program.");
    }

	public void Division() {
		// TODO Auto-generated method stub
		
	}
}
