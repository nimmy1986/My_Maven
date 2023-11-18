package Exception_Example;

import java.util.Scanner;

public class ExceptionExample1 
{
	public void operation(int num1,int num2)
	{
		int result;
		int arr[]=new int[5];
	
		
		try
		{
		result=num1/num2;
		System.out.println("Result is "+result);
		for(int i=0;i<5;i++)
		{
			arr[i]=i+1;
			System.out.println(arr[i]);
		}
		System.exit(0); //if there is no Exception 
		//this will execute and wont go to finally
		}
		catch(ArithmeticException e)
		{
			System.out.println("Division by 0 is not possible");
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Array size is 5");
		}
		catch(Exception en)
		{
			System.out.println("Exception Occured");
		}
		finally
		{
			System.out.println("Finally block...");
		}
		System.out.println("After Finally..");
	}

	public static void main(String[] args) 
	{
		ExceptionExample1 obj1= new ExceptionExample1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a=sc.nextInt();
		System.out.println("Enter the Second number:");
		int b=sc.nextInt();
		obj1.operation(a,b);
		
	}

}
