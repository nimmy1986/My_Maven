package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ColorsExample1 
{

	ArrayList<String> color=new ArrayList<String>();
	
	public void colorsetvalue()
	{
		color.add("Violet");
		color.add("Indigo");
		color.add("Blue");
		color.add("Green");
		color.add("Yellow");
		color.add("Orange");
		color.add("Red");
		System.out.println("Rainbow Colors...");
		System.out.println(color);
	}
	public void choosecolor()
	{
		System.out.println();
		System.out.println("Choosing a Color at index 4...");
		System.out.println(color.get(4));
		
	}
	
	public void colorIterate()
	{
		System.out.println();
		Iterator<String> it=color.iterator();
		while(it.hasNext())
		{
		System.out.println(it.next());
		}
	}
	public void removeColor()
	{
		System.out.println();
		System.out.println("Removing the third element form the list..");
		color.remove(3);
		System.out.println();
		System.out.println("List after removing the third element...");
		System.out.println(color);
	}
	
	public void searchColor()
	{
		Scanner cl=new Scanner(System.in);
		System.out.println();
		System.out.println("Enter the color to be searched: ");
		String colortobesearched=cl.next();
		
		if(color.contains(colortobesearched))
			{
				System.out.println("Color is present in the array list ");
			}
		else
			{
				System.out.println("Color is not present in the array list ");
			}
	}
	public static void main(String[] args) 
	{
		ColorsExample1 clr=new ColorsExample1();
		clr.colorsetvalue();
		clr.choosecolor();
		clr.removeColor();
		clr.searchColor();	
	}
}
