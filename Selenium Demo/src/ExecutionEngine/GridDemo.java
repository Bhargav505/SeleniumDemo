package ExecutionEngine;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridDemo {
	 public static WebDriver d=null;
		public static void main(String[] args) throws MalformedURLException {
			 DesiredCapabilities cap=new DesiredCapabilities();
			 cap.setPlatform(Platform.ANY);
			 cap.setBrowserName("internet explorer");
	         d=new RemoteWebDriver(new URL("http://192.168.1.22:5588/wd/hub"),cap);
			 //RemoteWebDriver d=new RemoteWebDriver(new 
	             // URL("http://localhost:5566/wd/hub"),cap);
			 //WebDriver d1=new RemoteWebDriver();
	       d.get("http://gmail.com");
	       System.out.println(d.getTitle());
		}


}
