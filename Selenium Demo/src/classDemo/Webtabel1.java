package classDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtabel1 {

	public static void main(String[] args) {
		 
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/gainers");
		WebElement element1=driver.findElement(By.tagName("table")); // table
		WebElement element2=element1.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[3]")); //xpath
	    String str=element2.getText(); 
		System.out.println("Value of third row "+str);
	}

}
