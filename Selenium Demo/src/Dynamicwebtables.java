import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicwebtables {

	public static void main(String[] args) {
		 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/webtables");
		WebElement webtable=driver.findElement(By.xpath("//div[@class='ReactTable -striped -highlight']"));
		List<WebElement>row=webtable.findElements(By.xpath(".//div[contains(@class,'rt-td') and text()]/ancestor::div[contains(@class,'rt-tr-group')]"));
		System.out.println("No of rows visible"+row.size());
		//Search for Alden in the search box
        driver.findElement(By.id("searchBox")).sendKeys("Alden");
        //Get the rows which has data
        row = webtable.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]"));
        //Print the number of rows visible       
        System.out.println("No of Rows Visible after Search: " + row.size());
        
		
	}

}
