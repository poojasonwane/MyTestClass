package KeywordDrivenFacebook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWriteExcelData 
{
	public ArrayList<String> readExcelData(int colno) throws IOException
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

//		Iterator row = sh.rowIterator();
//		row.next();
//		
//		ArrayList ar = new ArrayList();
//		
//		while(row.hasNext())
//		{
//			XSSFRow r = (XSSFRow) row.next();
//			
//			XSSFCell c = r.getCell(colno);
//			
//			String data = c.getStringCellValue();
//			
//			ar.add(data);
//			
//			ar.add(((XSSFRow) row.next()).getCell(colno).getStringCellValue());
//			
//			
//		}
//	//	System.out.println("List:"+ar);
//		
//		return ar;
	}

}
