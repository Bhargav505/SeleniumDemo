package classDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {

	public static void main(String[] args) throws IOException {
		File file=new File("E:\\Selenium\\Training\\Test Data.xlsx"); // Open the file
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook  wb=new XSSFWorkbook (fis);// Workbook
		XSSFSheet  sheet=wb.getSheet("Data"); // Access the sheet
		XSSFRow  row=sheet.createRow(3);
		row.createCell(0).setCellValue("Lisa");
//		row.createCell(1).setCellValue("meryln");
//		row.createCell(2).setCellValue("meryln123@yahoo.com");
//		row.createCell(3).setCellValue("F");
		FileOutputStream output = new FileOutputStream("E:\\Selenium\\Training\\Test Data.xlsx");
		wb.write(output);
	    wb.close();
		
	}

}
