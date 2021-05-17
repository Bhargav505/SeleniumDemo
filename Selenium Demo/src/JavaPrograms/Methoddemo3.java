package JavaPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methoddemo3 {
	
	public static WebDriver driver;
	
	public static void Login() {
		
		driver=new ChromeDriver();
		driver.get("https://www.linkedin.com/");
		driver.manage().window().maximize();
		
	}
	
	public void button(String str) {
		
	//driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		driver.findElement(By.xpath("//a[text()='"+str+"']")).click(); //Parametrization
	}
	
	
	
	
	

	public static void main(String[] args) {
		 
		

	}

}
