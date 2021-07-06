package classDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcel {

	public static void main(String[] args) throws IOException {
	 
		//Class objectname=new class();
	File file=new File("E:\\Selenium\\Training\\Test Data.xlsx"); // Open the file
	//String path = "E:\\Demo.xlsx";
	FileInputStream fis = new FileInputStream(file); // Read the data
	XSSFWorkbook  wb=new XSSFWorkbook (fis);// Workbook
	XSSFSheet  sheet=wb.getSheet("Data"); // Access the sheet
	XSSFRow  row=sheet.getRow(1);
   // Create a cell object to retreive cell at index 5
	XSSFCell  cell=row.getCell(3);
    // Get the address in a variable
    String email= cell.getStringCellValue();
   // Printing the Email
   System.out.println("name is :"+ email);
    
//	int Rowcount=sheet.getLastRowNum()-sheet.getFirstRowNum();
//	for(int i=0;i<Rowcount;i++) {  // Rows
//		int cellcount=sheet.getRow(i).getLastCellNum();
//		System.out.println("Row"+i);
//		
//		for(int j=0;j<cellcount;j++) { // columns
//			
//			//get cellcoun
//			System.out.println(sheet.getRow(i).getCell(j).getStringCellValue() +",");
//			
//			//i=3,j=0
//			
//		}

		
		
		
	}
	
	
   
}

		
