package Abstraction;

public class SearchAll extends Google
{

	public void search() 
	{
		System.out.println("Search all Method");
		
	}

	@Override
	public void newSearch() {
		System.out.println("newSearch all Method");
		
	}

}
