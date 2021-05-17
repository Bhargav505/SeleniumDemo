import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methodmain {
	
	 
	public static WebDriver driver;
	public static void s1()
	{
		
		System.out.println("In static method");
		
		
	}
	public static void Login()
	{
		
		System.out.println("In Login method");
	    driver=new ChromeDriver();
		driver.get("https://www.linkedin.com/");
	
	}
	
	public static void Signin(String str)
	{
		
	driver.findElement(By.xpath("//a[text()='"+str+"']")).click();
		
		
	}
	
	public void N1() {
		
		System.out.println("In Non static method");
	}
	
	
	

public static void main(String[] args) {
	
	Methodmain obj=new Methodmain();
	Methodmain.s1();
	obj.N1();
}

}