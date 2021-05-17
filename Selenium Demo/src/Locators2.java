import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		//driver.findElement(By.linkText("Gmail")).click();
		//driver.findElement(By.partialLinkText("Ima")).click();
		//driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[2]/a")).click();
		driver.findElement(By.className("gb_4 gb_5 gb_ae gb_4c")).click();
		

	}

}
