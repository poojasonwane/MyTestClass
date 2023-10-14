package Samplepack;

import java.io.IOException;
import java.util.ArrayList;

public class HybridExecuteTest 
{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		ReadWriteExcelKeyword  readwrite_obj = new ReadWriteExcelKeyword();
		
		ActionKey ak = new ActionKey();
		
		ArrayList keywords_li = readwrite_obj.readwriteExcelData(4);
		
		
		ArrayList locator_li = readwrite_obj.readwriteExcelData(5);
		
		ArrayList locatorvalue_li = readwrite_obj.readwriteExcelData(6);
		
		ArrayList dataset_li = readwrite_obj.readwriteExcelData(7);
		
		

		//ArrayList second_data_li = readwrite_obj.readwriteExcelData(8);
		
		//System.out.println(dataset_li); //dataset list println
		
		String locator,locatorvalue,testdata;
		
		for(int i=0;i<keywords_li.size();i++)
		{
			//i = 2
			String key = keywords_li.get(i).toString();
			
			//String testdata = dataset_li.get(i).toString();
			
			if(key.equals("navigate"))
			{
				String url = dataset_li.get(i).toString();
				
				ak.navigate(url);
			}
			else if(key.equals("enter_Email"))
			{
				locator = locator_li.get(i).toString();
				locatorvalue = locatorvalue_li.get(i).toString();
				testdata = dataset_li.get(i).toString();
				
				ak.enter_Email(locator,locatorvalue,testdata);
			}
			
		}
		
		
		
	}

}
