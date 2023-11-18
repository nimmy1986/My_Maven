package Abstraction;

import java.util.Scanner;

public class Contractor extends Employee
{
	public float calculateSalary()
	{
		Scanner sc=new Scanner(System.in);
		int paymentperhour=100;
		System.out.println("Enter the no. of working hours");
		float hoursworked=sc.nextInt();
		float Salary=paymentperhour*hoursworked;
		return Salary;
		
		
	}
}
