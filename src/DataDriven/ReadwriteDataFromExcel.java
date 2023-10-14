package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadwriteDataFromExcel 
{

	public static void main(String[] args) throws IOException 
	{
		File file = new File("C:\\Users\\MAXHUB\\Desktop\\Data\\Book1.xlsx");
		
		//Read data from file
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh = wb.getSheetAt(0);
		
		int rowcount = sh.getLastRowNum(); 
		for(int i=0;i<=rowcount;i++)
		{
			int colcount = sh.getRow(i).getLastCellNum();
			for(int j=0;j<colcount;j++)
			{
				System.out.print(sh.getRow(i).getCell(j)+" ");
			}
			System.out.println();
			System.out.println();
		}
		
		
		
//		//first row data
//		XSSFRow r1 = sh.getRow(0);
//
//		XSSFCell c1 = r1.getCell(0);
//		
//		XSSFCell c2 = r1.getCell(1);

//		System.out.println(c1+ " "+c2);
//	
//		//second row data
//		XSSFRow r2 = sh.getRow(1);
//
//		XSSFCell c3 = r2.getCell(0);
//		
//		XSSFCell c4 = r2.getCell(1);
//		
//		System.out.println(c3+ " "+c4);
		
		
//		r1.createCell(2).setCellValue("Status");
//		
//		FileOutputStream fout = new FileOutputStream(file);
//		wb.write(fout);
//		
		
		
		
	}

}
