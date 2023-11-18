package Collection;

import java.util.ArrayList;

public class ColorsExample 
{
	ArrayList<String> color=new ArrayList<String>();
	
	public void color()
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
	
	public static void main(String[] args) 
	{
		ColorsExample clr=new ColorsExample();
		clr.color();
	}

}
