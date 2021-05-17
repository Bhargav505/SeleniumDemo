import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
		//Alert with Ok and cancel
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();;
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		alert.accept();
		Thread.sleep(2000);
		//alert.dismiss(); 
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();;
		driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		Alert alert2=driver.switchTo().alert();
		System.out.println(alert2.getText());
		alert2.sendKeys("selenis user");
		 alert2.accept();
		 
		 
		 

	}

}
