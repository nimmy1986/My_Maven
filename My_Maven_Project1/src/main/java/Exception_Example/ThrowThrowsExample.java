package Exception_Example;

import java.io.IOException;

public class ThrowThrowsExample 
{
	int sum;
	public void calculation(int n1,int n2) throws ArithmeticException,IOException
	{
		sum=n1+n2;
		if(sum>25)
		{
			throw new ArithmeticException();
		}
		else
		{
			throw new IOException();
		}
	}
	public void display() throws ArithmeticException, IOException
	{
		calculation(5,4);
		System.out.println("Sum: "+sum);
	}
	public static void main(String[] args)
	{
		ThrowThrowsExample obj1=new ThrowThrowsExample();
		try
		{
		obj1.display();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Sum is greater than 25");
		}
		catch(IOException ex)
		{
			System.out.println("Sum is less than 25");
		}
	}

}
