package AssignmentPackage2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import AssignmentPackage1.RBIMethods;

public class SBIMethods implements RBIMethods
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


		@Override
		public void interest(double pa, double r, double p) 
		{
			double SI=(pa*r*p)/100;
			System.out.println("Simple Interest: "+SI);
		}
	}
