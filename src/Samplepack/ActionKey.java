package Samplepack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionKey 
{
	
	WebDriver d1;
	
	public void navigate(String url) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		
		d1 = new ChromeDriver();
		d1.manage().window().maximize();
		d1.get(url);
		Thread.sleep(3000);
		d1.close();
	}
	
	public void enter_Email(String locator,String locatorvalue,String username)
	{
		if(locator.equals("name"))
		{
			d1.findElement(By.name(locatorvalue)).sendKeys(username);	
		}
		else if(locator.equals("xpath"))
		{
			d1.findElement(By.name(locatorvalue)).sendKeys(username);
		}
		else
		{
			System.out.println("Invalid locator");
		}
		
	}

}
