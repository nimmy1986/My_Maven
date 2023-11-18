package AssignmentPackage3;
import java.util.Scanner;

import AssignmentPackage1.RBIMethods;
import AssignmentPackage2.SBIMethods;

public class FederalMethods implements RBIMethods
{
	public void Check()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Amount to be Withdrawn: ");
		double Cashtobewithdrawn=sc.nextDouble();
		
		if(Cashtobewithdrawn>=50000)
		{
			System.out.println("PAN Details required!!");
		}
		else
		{
			System.out.println("PAN Details not required. You can withdraw the cash.");
		}
	}
	
	public void interest(double pa, double r, double p) 
	{
		double compoundInterest = pa*Math.pow(1+r/100, p);
		System.out.println("Compound Interest : "+compoundInterest);
    }
		
	
}
