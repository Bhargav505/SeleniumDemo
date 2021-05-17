package classDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtabledemo {

	public static void main(String[] args) {
 
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/gainers");
		List<WebElement>cols=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		System.out.println("Number of columns "+cols.size());
		List<WebElement>rows=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		System.out.println("Number of rows "+rows.size());
		

	}

}
