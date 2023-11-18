package ExcelReading;

import java.io.IOException;

public class ExcelFileMain 
{
	
	public static void main(String[] args) throws IOException 
	{
		ExcelFileReading obj1=new ExcelFileReading();
		obj1.readFile();
		String value=obj1.readData(1, 0);
		System.out.println("Value: "+value);
		

	}

}
