package Resources;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
public static WebDriver driver;
public static BufferedReader f;
public static Properties prop;
private static String url,browser,username;

public static void config() throws FileNotFoundException {
	f=new BufferedReader(new FileReader("C:\\Users\\Bhargav\\eclipse-workspace\\DataDrivenFramework\\src\\test\\java\\Resources\\configuration.properties"));
	try {
		prop=new Properties();
		prop.load(f);
		f.close();
		
	}catch(Exception e) {
		
	}
}
	public static void login() {
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			browser=prop.getProperty("browser");
			System.out.println(prop.getProperty("browser"));
			driver=new ChromeDriver();
			url=prop.getProperty("url");
		     driver.get(url);
		     username=prop.getProperty("username");
		     driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys(username);
		}
		     
		else if(prop.getProperty("browser").equalsIgnoreCase("IE")) {
			System.out.println(prop.getProperty("browser"));
			browser=prop.getProperty("browser");
			driver=new InternetExplorerDriver();
			url=prop.getProperty("url");
		     driver.get(url);

	
}

		  
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}