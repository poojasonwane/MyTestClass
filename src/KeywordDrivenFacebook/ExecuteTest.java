package KeywordDrivenFacebook;

import java.io.IOException;
import java.util.ArrayList;


public class ExecuteTest {

	public static void main(String[] args) throws IOException 
	{
		ReadWriteExcelData  readwrite = new ReadWriteExcelData ();
		
		ArrayList Keyword_list = readwrite.readExcelData(4);
		
		ArrayList Locatorname_list = readwrite.readExcelData(5);
		
		ArrayList Locatorvalue_list = readwrite.readExcelData(6);
		
		ArrayList test_data_list = readwrite.readExcelData(7);
		
		ActionKeywords ak = new ActionKeywords();
		
		for(int i=0;i<Keyword_list.size();i++)
		{
			String choice = Keyword_list.get(i).toString();
			
			String testdata;
			
			if(test_data_list.equals("null"))
			{
				testdata="";
				
			}
			else
			{
				testdata=test_data_list.get(i).toString();
			}
			
			if(choice.equalsIgnoreCase("navigate"))
			{
				String url = test_data_list.get(i).toString();
				ak.navigate(url);
				
			}
			else if(choice.equalsIgnoreCase("enter_Email"))
			{
				
				String locator = Locatorname_list.get(i).toString();
				String locatorvalue = Locatorvalue_list.get(i).toString();
				testdata = test_data_list.get(i).toString();
				
				ak.enter_Email(locator,locatorvalue,testdata);
			}
			else if(choice.equalsIgnoreCase("enter_Pass"))
			{
				String locator = Locatorname_list.get(i).toString();
				String locatorvalue = Locatorvalue_list.get(i).toString();
				testdata = test_data_list.get(i).toString();
				
				ak.enter_Pass(locator,locatorvalue,testdata);
			}
			else if(choice.equalsIgnoreCase("click_Loginbutton"))
			{
				String locator = Locatorname_list.get(i).toString();
				String locatorvalue = Locatorvalue_list.get(i).toString();
				
				ak.click_Loginbutton(locator,locatorvalue);
			}
			else
			{
				System.out.println(choice);
			}
		}

	}

}
