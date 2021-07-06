package classDemo;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.javac.util.Assert;

public class Testcase {

	public static void main(String[] args) {
	 
		
	WebDriver driver=new ChromeDriver();	
	driver.get("https://www.godaddy.com/");
	driver.manage().window().maximize();
	String title="Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN";
	String str2=driver.getTitle();
	System.out.println("Title of the webpage is"+str2);
	assertEquals(title, str2);
	System.out.println("Title is pass");
	String str=driver.getCurrentUrl();
	System.out.println("URL of the webpage is"+str);
	String url="https://in.godaddy.com/";
	assertEquals(url, str);
	System.out.println("url is pass");
//	String str1=driver.getPageSource();
//	System.out.println("Pagesource is  is"+str1);
	driver.close();
	}

}
