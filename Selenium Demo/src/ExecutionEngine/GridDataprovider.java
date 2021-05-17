package ExecutionEngine;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class GridDataprovider {
	@Test(dataProvider="browserSelection")
	 
	public void m1(String browser,String url) throws MalformedURLException{
		WebDriver driver=null;
		DesiredCapabilities cap=new DesiredCapabilities();
		switch (browser){
		case "firefox":
			cap.setBrowserName("firefox");
			 cap.setPlatform(Platform.ANY); 
			 driver=new RemoteWebDriver(new
					 URL("http://192.168.1.22:5577/wd/hub"), cap);
			 break;
		case "chrome":
			cap.setBrowserName("chrome");
			 cap.setPlatform(Platform.ANY); 
			 driver=new RemoteWebDriver(new
					 URL("http://192.168.1.22:5566/wd/hub"), cap);
			 break;
		case "IE":
			cap.setBrowserName("internet explorer");
			 cap.setPlatform(Platform.ANY); 
			 driver=new RemoteWebDriver(new
					 URL("http://192.168.1.22:5588/wd/hub"), cap);
			 break;
		default:
			System.out.println("invalid browsername");
		}
//		 RemoteWebDriver driver=new RemoteWebDriver(new
//				 URL("http://localhost:4444/wd/hub"), cap);
         driver.get(url);
         System.out.println(driver.getTitle());
        // driver.quit();
	}
	
	@DataProvider(parallel=true)
	public static Object[][] browserSelection(){
		Object[][] br=new Object[3][2];
		br[0][0]="firefox";			
		br[0][1]="http://yahoo.com";
		
		br[1][0]="internetexplorer";
		br[1][1]="http://rediff.com";
		
		br[2][0]="chrome";
		br[2][1]="http://gmail.com";
		return br;
	}
	
	
}
