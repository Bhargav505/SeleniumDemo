import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IfElementpresent {

	public static void main(String[] args) {
		 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://www.paypal.com/in/home");
		if(driver.findElements(By.xpath("//a[text()='Sign Up for Free'][@name='ctaId']")).size()!=0)
		{
			System.out.println("Element is present");
			driver.findElement(By.xpath("//a[text()='Sign Up for Free'][@name='ctaId']")).click();
		}
		else
			System.out.println("Element is not present");
		 
		

	}

}
