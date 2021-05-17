package classDemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewindow {

	public static void main(String[] args) {
 
		 WebDriver driver=new ChromeDriver();
	        driver.get("https://www.naukri.com/");
	        driver.manage().window().maximize();
		// Return the parent window name
	        String parent=driver.getWindowHandle();
	     // This will return the number of windows opened by Webdriver and will return Set of Strings
	      Set<String>s1=driver.getWindowHandles();
		  Iterator<String>I1=s1.iterator();
		// Now we will iterate using Iterator
		  while(I1.hasNext()) {
			  String child_window=I1.next();
			// Here we will compare if parent window is not equal to child window then we            will close
			  if(!parent.equals(child_window))
			  {
			  driver.switchTo().window(child_window);
			   
			  System.out.println(driver.switchTo().window(child_window).getTitle());
			   
			  driver.close(); // closes all the current driver windows
			  }
			   
			  }
			  // once all pop up closed now switch to parent window
			  driver.switchTo().window(parent);
			   

			  
		  }
		
		

	}


