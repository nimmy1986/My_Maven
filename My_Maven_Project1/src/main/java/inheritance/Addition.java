package inheritance;
import java.util.*;
public class Addition 
{
	public int AddResult()
	{
		int num1,num2,result;
		Scanner ad=new Scanner(System.in);
		System.out.println("Enter the 1st number: ");
		num1=ad.nextInt();
		System.out.println("Enter the 2nd number: ");
		num2=ad.nextInt();
		result=num1+num2;
		return result;
	}

}
