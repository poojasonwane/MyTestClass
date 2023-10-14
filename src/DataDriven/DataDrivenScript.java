package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenScript 
{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://lms.fortunecloudindia.com");
		
		driver.manage().window().maximize();
		
		File file = new File("C:\\Users\\MAXHUB\\Desktop\\Data\\Book1.xlsx");
		
		//Read data from file
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh = wb.getSheetAt(0);
		
		int rowcount = sh.getLastRowNum(); 
		
		for(int i=1;i<=rowcount;i++)
		{
			driver.findElement(By.name("username")).sendKeys(sh.getRow(i).getCell(0).getStringCellValue());
			
			driver.findElement(By.name("password")).sendKeys(sh.getRow(i).getCell(1).getStringCellValue());
			
			Thread.sleep(3000);		
			
			driver.findElement(By.name("login")).click();
			
			String expect = "https://lms.fortunecloud.com";
			
			String act = driver.getCurrentUrl();
			
			if(expect.equals(act))
			{
				sh.getRow(i).createCell(2).setCellValue("Fail");
				//System.out.println("Fail");
			}
			else
			{
				sh.getRow(i).createCell(2).setCellValue("Pass");
				//System.out.println("pass");
				
			}
			
			FileOutputStream fout = new FileOutputStream(file);
			wb.write(fout);

		}
		

	}

}
