package KeywordDrivenFramework;

import java.io.IOException;
import java.util.ArrayList;

public class ExecuteTest 
{

	public static void main(String[] args) throws IOException 
	{
		ActionKeywords ak_obj = new ActionKeywords();
		
		ReadWriteExcel readwrite_obj = new ReadWriteExcel();
		
		ArrayList keywords_List = readwrite_obj.keywords(4);
		
		ArrayList Locators_list = readwrite_obj.keywords(5);
				
		ArrayList Locators_value = readwrite_obj.keywords(6);
		
		ArrayList test_data = readwrite_obj.keywords(7);
		 
		for(int i =0;i<keywords_List.size();i++)
		{
			String choice = keywords_List.get(i).toString();
			
			
			String testdata;
			if(test_data.get(i).equals("null"))
			{
				testdata ="";
			}
			else
			{
				testdata=test_data.get(i).toString();
			}
			
			if(choice.equalsIgnoreCase("openBrowser"))
			{
				ak_obj.openBrowser();
			}
			else if(choice.equalsIgnoreCase("Navigate_url"))
			{
				String url=test_data.get(i).toString();
				ak_obj.Navigate_url(url);
			}
			else if(choice.equalsIgnoreCase("verifyTitle"))
			{
				ak_obj.verifyTitle();
			}
			else if(choice.equalsIgnoreCase("enter_Email"))
			{
				String locator=Locators_list.get(i).toString();
				String locatorvalue=Locators_value.get(i).toString();
				testdata =test_data.get(i).toString();
				
				ak_obj.enterEmail(locator,locatorvalue,testdata);
			}
			else if(choice.equalsIgnoreCase("enter_Pass"))
			{
				String locator=Locators_list.get(i).toString();
				String locatorvalue=Locators_value.get(i).toString();
				testdata =test_data.get(i).toString();
				
				ak_obj.enterPass(locator,locatorvalue,testdata);
			}
			else if(choice.equalsIgnoreCase("click_Button"))
			{
				String locator=Locators_list.get(i).toString();
				String locatorvalue=Locators_value.get(i).toString();
				
				ak_obj.click_Button(locator,locatorvalue);
			}
			else 
			{
				System.out.println("Invalid keyword");
			}
			System.out.println(keywords_List.get(i));
		}

	}

}
