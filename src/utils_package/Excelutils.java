package utils_package;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutils {
	
	public static Object[][] getTestData(String filePath, String sheetname) throws IOException{
		 FileInputStream fis = new FileInputStream(filePath);// read excel path
		 XSSFWorkbook workbook= new XSSFWorkbook(fis);//get excel workbook
		 XSSFSheet sheet = workbook.getSheet(sheetname);//to get the sheet
		 
		 int rows = sheet.getLastRowNum();// excluding the header
		 int cols=sheet.getRow(0).getLastCellNum();
		 
		 System.out.println(rows);
		 System.out.println(cols);
		 
		 Object[][]data = new Object[rows][cols];//create 2 array it can store multiple rows and columns
		 DataFormatter formatter = new DataFormatter();//Converts all cell values to String format
		 
		 for(int i= 1;i<=rows;i++)
		 {
			 for(int j=0;j<cols;j++)
			 {
				 data[i-1][j]=formatter .formatCellValue(sheet.getRow(i).getCell(j));
			 }
		 }
		 workbook.close();
		 fis.close();
		 
		 return data;
		 
		
	}
	
	
	
		
	

}
