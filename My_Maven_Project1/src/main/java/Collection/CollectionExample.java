package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CollectionExample 
{
	ArrayList<String> ls=new ArrayList<String>();
	
	public void ArrayExample()
	{
		ls.add("GIA");
		ls.add("GIA");
		ls.add("RIA");
		ls.add("MIA");
		ls.add("TIA");
		System.out.println("List: "+ls);
		ls.remove(1);
		System.out.println("List After Deletion: "+ls);
		Collections.sort(ls);
		System.out.println("List After Sorting: "+ls);
		System.out.println("Example of size and get methods...");
		for(int i=0;i<ls.size();i++)
		{
			System.out.println(ls.get(i));
		}
		System.out.println("After using For each");
		for(String e:ls)
		{
			
			System.out.println(e);
		}
		System.out.println("Iteration...");
		Iterator<String> it=ls.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	public static void main(String args[])
	{
		CollectionExample obj1= new CollectionExample();
		obj1.ArrayExample();
	}
}
