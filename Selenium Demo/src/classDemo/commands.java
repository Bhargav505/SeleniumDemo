package classDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class commands {

	public static void main(String[] args) {
		 
		 WebDriver driver=new ChromeDriver();
	        driver.get("http://demo.automationtesting.in/");
	        driver.navigate().refresh();
	        driver.navigate().back();
	        driver.navigate().forward();
	       //maximize browser
	        driver.manage().window().maximize();
	        // full screen window
	        driver.manage().window().fullscreen();
	        //delete all cookies
	        driver.manage().deleteAllCookies();
	        //currentitle
	        String str=driver.getCurrentUrl();
	        System.out.println("URL of the webpage"+str);
	        String str1=driver.getTitle();
	        System.out.println("Title of the webpage"+str1);
	        String str2=driver.getPageSource();
	        System.out.println("Page source of the webpage"+str2);
		
		
		
		
		
		
		

	}

}
