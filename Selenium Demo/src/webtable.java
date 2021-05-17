import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {

	public static void main(String[] args) {
		 
		 System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://money.rediff.com/gainers");
//		List<WebElement>col=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
//		System.out.println("No of cols"+col.size());
//		
//		List<WebElement>row=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
//		System.out.println("No of rows"+row.size());
		WebElement basetable=driver.findElement(By.tagName("table"));
		WebElement tablerow=basetable.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[3]"));
		
		String str=tablerow.getText();
		System.out.println(""+str);
		 
		
		
		

	}

}
