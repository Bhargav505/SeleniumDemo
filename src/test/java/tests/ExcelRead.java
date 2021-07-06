package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExcelRead {
	
	public static String Email,password;
	public static WebDriver driver;
	
	@BeforeTest
	public void launchbrowser() {
		driver=new ChromeDriver();
		driver.get("https://www.linkedin.com/");
	}
	
  @Test
  public void input() throws IOException {
	  
	  File file=new File("E:\\TestData.xlsx");
      FileInputStream fis=new FileInputStream(file);
	  XSSFWorkbook wb=new XSSFWorkbook(fis);
	  XSSFSheet sheet=wb.getSheet("Data");
	  int Rowcount=sheet.getLastRowNum()+1;
	  System.out.println("Rowcount"+Rowcount);
	  for(int i=1;i<Rowcount;i++)
	  {
		  XSSFRow rowindex=sheet.getRow(i);    
		  XSSFCell status=rowindex.getCell(3);  //Runstatus column
		   String runStatus=String.valueOf(status);
		   System.out.println("runStatus="+runStatus);
		   if((runStatus.toUpperCase()).startsWith("Y")){		
		  Email=sheet.getRow(i).getCell(1).getStringCellValue();
		  password=sheet.getRow(i).getCell(2).getStringCellValue();
		  try {
			    
	  driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys(Email);
	  driver.findElement(By.xpath("//input[@autocomplete='current-password']")).sendKeys(password);
	  driver.findElement(By.xpath("//button[text()[contains(.,'Sign in')]]")).click();
		  }catch(Exception e){
			  File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    	FileUtils.copyFile(f, new File("C:\\Users\\Bhargav\\eclipse-workspace\\DataDrivenFramework\\Screenshots\\loginError.jpg"));

			  System.out.println("Exception is"+e);
			  
		  }
	  
  }
		   wb.close();
}

  }
	  }