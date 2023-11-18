package Encapsulation;

import java.util.Scanner;

public class User {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Amount for withdrawal:");
		int amount=sc.nextInt();
		System.out.println("Enter the PIN: ");
		int pin=sc.nextInt();
		Bank obj1=new Bank();
		obj1.setPin(pin);
		
	}

}
