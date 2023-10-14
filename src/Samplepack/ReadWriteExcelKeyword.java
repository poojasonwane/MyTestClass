package Samplepack;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWriteExcelKeyword 
{
	
	public static ArrayList readwriteExcelData(int colno) throws IOException
	{
		
		File f1 = new File("C:\\Users\\Admin\\eclipse-workspace\\FrameworkSelenium\\FrameworkSelenium\\src\\exceldata\\keyword.xlsx");
		
		FileInputStream fis = new FileInputStream(f1);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh = wb.getSheetAt(0);
		
		ArrayList data = new ArrayList();
		
		int rowcount= sh.getLastRowNum();
		
		for(int i=1;i<=rowcount;i++)
		{
			data.add(sh.getRow(i).getCell(colno));
		}
		
		return data;
		
	}

}
