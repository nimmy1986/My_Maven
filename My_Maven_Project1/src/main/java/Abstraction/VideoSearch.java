package Abstraction;

public class VideoSearch extends Google
{

	public void search() 
	{
		System.out.println("Video Search Method");
	}

	@Override
	public void newSearch() 
	{
		System.out.println("Video newSearch Method");
		
	}
	

}
