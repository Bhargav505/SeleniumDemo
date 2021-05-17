package ExecutionEngine;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import config.ActionKeyword;

public class TestExecution {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		 
	File path=new File("C:\\Users\\Bhargav\\eclipse-workspace\\Selenium Demo\\src\\dataEngine\\TestEngine.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(path);
	XSSFSheet sheet=wb.getSheet("Sheet1");
	 int Rowcount=sheet.getLastRowNum()+1;
	 for(int i=1;i<Rowcount;i++)
	  {
		 XSSFRow rowindex=sheet.getRow(i);    
		  XSSFCell status=rowindex.getCell(3); 
		  String str=String.valueOf(status);
		  System.out.println(str);
	if(str=="openthebrowser")
		   ActionKeyword.openthebrowser();
			ActionKeyword.navigate();
				 
	} 
	}
}
