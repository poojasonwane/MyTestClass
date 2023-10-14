package KeywordDrivenFacebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionKeywords 
{
	WebDriver d1;
	
	public void navigate(String url)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		
		d1 = new ChromeDriver();
		d1.manage().window().maximize();
		d1.get(url);
	}
	
	public void enter_Email(String locator,String locatorvalue,String username)
	{
		if(locator.equals("name"))
		{
			d1.findElement(By.name(locatorvalue)).sendKeys(username);	
		}
		
	}
	
	public void enter_Pass(String locator, String locatorvalue,String password)
	{
		if(locator.equals("name"))
		{
			d1.findElement(By.name(locatorvalue)).sendKeys(password);
		}
	
	}
	
	public void click_Loginbutton(String locator ,String locatorvalue)
	{
		if(locator.equals("name"))
		{
			d1.findElement(By.name(locatorvalue)).click();
		}
		
	}

}
