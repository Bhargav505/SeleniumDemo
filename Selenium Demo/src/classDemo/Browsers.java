package classDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browsers {

	public static void main(String[] args) {
	 
		String Browser="firefox";
		switch(Browser) {
		
		case "chrome":
        WebDriver driver=new ChromeDriver();
        driver.get("http://demo.automationtesting.in/");
        break;
        
		case "firefox":
    	WebDriver driver1=new FirefoxDriver();
    	driver1.get("http://demo.automationtesting.in/");
		break;
		
		case "IE":
		//System.setProperty("webdriver.ie.driver","C:\\Users\\Bhargav\\Downloads\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
		WebDriver driver2=new InternetExplorerDriver();
		driver2.get("http://demo.automationtesting.in/");
		break;
		
		}
		
		
		
		
		
		
		

	}

}
