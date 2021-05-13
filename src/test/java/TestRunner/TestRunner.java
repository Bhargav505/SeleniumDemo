package TestRunner;
  
import java.io.File;


import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
	@RunWith(Cucumber.class)				
	@CucumberOptions(features="C:\\Users\\Bhargav\\eclipse-workspace\\DataDrivenFramework\\Features\\EndToEndTest.Feature",
	glue={"Stepdefintion"},plugin = { "com.cucumber.listener.ExtentCucumberFormatter:C:\\Users\\Bhargav\\eclipse-workspace\\DataDrivenFramework\\Reports/report.html"},
			 monochrome = true,
	tags= {"@Alltestcases"})		
	
	public class TestRunner 				
	{		
		@AfterClass
		 public static void writeExtentReport() {
			Reporter.loadXMLConfig(new File("config/extent-config.xml"));
		 }
	}

