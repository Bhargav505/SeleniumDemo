import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writeexcel {

	public static void main(String[] args) throws IOException {
		
		File file=new File("E:\\Demo.xlsx"); // Open the file
		//String path = "E:\\Demo.xlsx";
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook  wb=new XSSFWorkbook (fis);
		XSSFSheet  sheet=wb.getSheet("Data"); // Access the sheet
		XSSFRow  row=sheet.createRow(3);
	   // Create a cell object to retreive cell at index 5
		 row.createCell(0).setCellValue("Diana");
		 //write the data in excel using output stream
		    FileOutputStream outputStream = new FileOutputStream("E:\\Demo.xlsx");
		    wb.write(outputStream);
		    wb.close();

	}
	 
}
