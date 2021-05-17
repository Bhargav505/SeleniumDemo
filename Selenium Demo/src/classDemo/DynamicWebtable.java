package classDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebtable {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		WebElement Tablename=driver.findElement(By.xpath("//div[@class='ReactTable -striped -highlight']")); // table
		
		//Number of Rows in the table
	 List<WebElement>rows=Tablename.findElements(By.xpath(".//div[contains(@class,'rt-td') and text()]/ancestor::div[contains(@class,'rt-tr-group')]"));
		System.out.println("Number of Rows visible"+rows.size());
		driver.findElement(By.xpath("//input[@placeholder='Type to search']")).sendKeys("Alden");
		//Number of dynamic rows in the table
		 List<WebElement>rows1=Tablename.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div/div[1]"));
			System.out.println("Number of Rows After search"+rows1.size());
		
		
	}

}
