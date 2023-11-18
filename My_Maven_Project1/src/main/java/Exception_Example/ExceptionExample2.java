package Exception_Example;

public class ExceptionExample2 
{
	public void ArrayExample()
	{
		int arr[]=new int[5];
		try
		{
			for(int i=0;i<=5;i++)
			{
				arr[i]=i+1;
				System.out.println(arr[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Array size is 5");
		}
	}
	public static void main(String[] args) 
	{
		ExceptionExample2 obj1=new ExceptionExample2();
		obj1.ArrayExample();
	}

}
