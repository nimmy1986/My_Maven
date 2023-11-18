package Abstraction;

public class ImageSearch extends Google
{

	public void search() 
	{
		System.out.println("Image search Method");
	}
	public void newSearch() 
	{
		System.out.println("Image search Method 2");
	}
	public static void main(String[] args) 
	{
		ImageSearch obj1=new ImageSearch();
		obj1.search();
		obj1.display();
		obj1.newSearch();
		VideoSearch obj2=new VideoSearch();
		obj2.search();
		obj2.newSearch();
		obj2.display();
		SearchAll obj3=new SearchAll();
		obj3.search();
		obj3.newSearch();
		obj3.display();

	}

}
