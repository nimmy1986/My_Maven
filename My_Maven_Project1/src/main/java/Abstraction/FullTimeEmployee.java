package Abstraction;

import java.util.Scanner;

public class FullTimeEmployee 
{
	public float calculateSalary()
	{
		int paymentperhour=100;
		final float HOURS_WORKED=8;
		float Salary=paymentperhour*HOURS_WORKED;
		return Salary;
	}
	public static void main(String args[])
	{
		FullTimeEmployee fte=new FullTimeEmployee();
		System.out.println("Salary of the fulltime Employee is "+fte.calculateSalary());
		Contractor ctr=new Contractor();
		System.out.println("Salary of the Contractor Employee is "+ctr.calculateSalary());
		
	}
}
