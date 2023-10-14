package KeywordDrivenFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionKeywords 
{
	WebDriver d1;

	public void openBrowser() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		d1 = new ChromeDriver();
		d1.manage().window().maximize();	
	}

	public void Navigate_url(String url) 
	{
		d1.get(url);
	}

	public void verifyTitle() 
	{
		String exp = "https://lms.fortunecloudindia.com/";
		String actual = d1.getCurrentUrl();
		if(exp.equals(actual))
		{
			System.out.println("testPass");
		}
		else
		{
			System.out.println("testFail");
		}
		
	}

	public void enterEmail(String locator, String locatorvalue, String testdata) 
	{
		if(locator.equals("name"))
		{
			d1.findElement(By.name(locatorvalue)).sendKeys(testdata);
		}
		else 
		{
			d1.findElement(By.xpath(locatorvalue)).sendKeys(testdata);
		}
		
	}

	public void enterPass(String locator, String locatorvalue, String testdata) 
	{
		if(locator.equals("name"))
		{
			d1.findElement(By.name(locatorvalue)).sendKeys(testdata);
		}
		else
		{
			d1.findElement(By.xpath(locatorvalue)).sendKeys(testdata);
		}
		
	}

	public void click_Button(String locator, String locatorvalue) 
	{
		if(locator.equals("name"))
		{
			d1.findElement(By.name(locatorvalue)).click();
		}
		else
		{
			d1.findElement(By.xpath(locatorvalue)).click();
		}
		
	}
	

	
}
