import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class webelements {

	public static void main(String[] args) {
		
		String Browser="chrome";
	    switch(Browser)
		{
	    case "chrome":
	    System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/");
		driver.manage().window().maximize();
		driver.quit();
		break;
	    case "firefox":
		System.setProperty("webdriver.firefox.driver","geckodriver.exe");
		WebDriver driver1=new FirefoxDriver();
		driver1.get("http://demo.automationtesting.in/");
		driver1.manage().window().maximize();
		driver1.quit();
		break;
	    case "IE":
		System.setProperty("webdriver.IE.driver","IEDriverServer.exe");
		WebDriver driver2= new InternetExplorerDriver();
		driver2.get("http://demo.automationtesting.in/");
		driver2.manage().window().maximize();
		driver2.quit();
		break;
		default:
			System.out.println("browser not found");
}
	}
}