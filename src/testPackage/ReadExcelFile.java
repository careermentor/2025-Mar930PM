package testPackage;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class ReadExcelFile 
{

	@Test
	public void readexcel() throws Exception
	{
		File f = new File("C:\\TestData\\learnExcel.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh1 = wb.getSheet("data");
		
		int nr = sh1.getPhysicalNumberOfRows();
		
		for(int i=0; i<nr; i++)
		{
			XSSFRow row = sh1.getRow(i); 
			
			int nc = row.getPhysicalNumberOfCells();
			
			for(int j=0; j<nc; j++)
			{
				XSSFCell col = row.getCell(j);
				System.out.print(col.getStringCellValue()  +  "    ");
				
				//col.getNumericCellValue();
				//col.getBooleanCellValue();
				
			}
			
			System.out.println();
			
			/*
			XSSFCell col1 = row.getCell(0);
			System.out.print(col1.getStringCellValue()  +  "    ");
			
			XSSFCell col2 = row.getCell(1);
			System.out.println(col2.getStringCellValue()  +  "    ");
			*/
		}
		
		
		
		/*
		
		
		//first row
		
		XSSFRow row1 = sh1.getRow(0);    
		
		XSSFCell col1 = row1.getCell(0);
		System.out.print(col1.getStringCellValue()  +  "    ");
		
		XSSFCell col2 = row1.getCell(1);
		System.out.println(col2.getStringCellValue() + "   ");

		
		//second row
		
		XSSFRow row2 = sh1.getRow(1);    
		
		XSSFCell col21 = row2.getCell(0);
		System.out.print(col21.getStringCellValue()+ "    ");
		
		XSSFCell col22 = row2.getCell(1);
		System.out.println(col22.getStringCellValue());
		
		*/
	}
	
	
}
