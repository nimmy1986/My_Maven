package AssignmentPackage4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import AssignmentPackage3.FederalMethods;
import AssignmentPackage2.SBIMethods;

public class User 
{
	public User()throws FileNotFoundException, IOException
	{
		
	}
	double principalamountsbi,principalamountfd;
	double ratesbi,ratefd;
	double periodsbi,periodfd;
	
	
	
			public void readBankDataSbi() throws IOException
				{
				FileInputStream bdf=new FileInputStream("C:\\Users\\anups\\git\\My_Maven\\My_Maven_Project1\\src\\main\\resources\\BankDetails.xlsx");
				XSSFWorkbook w = new XSSFWorkbook(bdf);
				XSSFSheet sh=w.getSheet("Sheet1");
						
				Cell c1=sh.getRow(1).getCell(1);
				Cell c2=sh.getRow(2).getCell(1);
				Cell c3=sh.getRow(3).getCell(1);
				
				principalamountsbi=c1.getNumericCellValue();
				ratesbi=c2.getNumericCellValue();
				periodsbi=c3.getNumericCellValue();
				SBIMethods sbi1 = new SBIMethods();
				sbi1.interest(principalamountsbi,ratesbi,periodsbi);
				}
			public void readBankDataFederal() throws IOException
			{
				FileInputStream bdf=new FileInputStream("C:\\Users\\anups\\git\\My_Maven\\My_Maven_Project1\\src\\main\\resources\\BankDetails.xlsx");
				XSSFWorkbook w = new XSSFWorkbook(bdf);
				XSSFSheet sh=w.getSheet("Sheet1");
					
			Cell c1=sh.getRow(1).getCell(2);
			Cell c2=sh.getRow(2).getCell(2);
			Cell c3=sh.getRow(3).getCell(2);
			
			principalamountfd=c1.getNumericCellValue();
			ratefd=c2.getNumericCellValue();
			periodfd=c3.getNumericCellValue();
			FederalMethods fd1=new FederalMethods();
			fd1.interest(principalamountfd, periodsbi, periodfd);
			
			}
							
			public void SelectBank() throws IOException
			{
				
			
				Scanner sc=new Scanner(System.in);
				System.out.println("Select bank: 1.SBI  2.Federal");
				int option = sc.nextInt();
				switch(option) {
					case 1:
						SBIMethods sbi = new SBIMethods();
						sbi.Check();
						readBankDataSbi();
						
						
						break;
					case 2:
						FederalMethods fd = new FederalMethods();
						fd.Check();
						readBankDataFederal();
						
						
						break;
					default:
						System.out.println("Choose a valid option");
						break;
				}
				
			}
			
			public static void main(String[] args) throws FileNotFoundException, IOException
			{
				User obj1 = new User();
				obj1.SelectBank();
			}

	}


