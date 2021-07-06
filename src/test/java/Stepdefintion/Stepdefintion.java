package Stepdefintion;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Pages.Homepage;
import Pages.Register;
import Pages.Shop;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefintion extends Functionlibrary {
	
	public static WebDriver driver;
	 
	
	@Test
	@Given("^open the \"([^\"]*)\" of the application$")
	public void open_the_url(String url) throws Throwable {
			login(url);
					
		
}
	
	public void Register(WebDriver driver) {
		 this.driver=driver;
	}
@Given("^click on button \"([^\"]*)\" in amazon page$")
	public void click_on_mobiles_in_amazon_page(String button) throws Throwable {
		button(button);
	}
	
@Then("^verify the title \"([^\"]*)\" of the page$")
public void verify_the_title_of_the_page(String str) throws Throwable {
    driver.findElement(By.xpath("//img[@alt='"+str+"']"));
    		 
}

@Then("^Take Screenshot of the page$")
public void take_Screenshot_of_the_page() throws Throwable {
	TakeScreenshot();
}

@Given("^click on the button \"([^\"]*)\" in the Home page$")
public void click_on_the_button_in_the_page(String value) throws Throwable {
	Homepage home=new Homepage(driver);
	home.Home_button(value);
	
}
@Then("^close the browser$")
public void close_the_browser() throws Throwable {
	closed();
}

@Given("^click on the button \"([^\"]*)\" in the webpage$")
public void click_on_the_button_in_the_webpage(String value) throws Throwable {
    
	Shop.link(value);
	 
}
@When("^Enter the \"([^\"]*)\" as \"([^\"]*)\" in thee Register page$")
public void enter_the_in_the_Register_page(String value1,String value2) throws Throwable {
     Register reg=new Register(driver);
     reg.Register_Textbox(value1,value2);
}

@Then("^wait for the page to load$")
public void wait_for_the_page_to_load() throws Throwable {
	Thread.sleep(3000);
    
}

	
@Given("^Enter the \"([^\"]*)\" in the home page$")
public void enter_the_in_the_home_page(String url) throws Throwable {
     
	login(url);
	
}
@When("^Enter the username \"([^\"]*)\" in the textbox$")
public void enter_the_username_in_the_textbox(String value) throws Throwable {
     driver.findElement(By.xpath("//input[@name='username']")).sendKeys(value);
	
}
@Then("^click on the next button$")
public void click_on_the_next_button() throws Throwable {
     
	driver.findElement(By.xpath("//input[@name='signin']")).click();
	Thread.sleep(7000);
	
}
@Then("^click on the checkbox in the page$")
public void click_on_the_checkbox_in_the_page() throws Throwable {
	
	driver.findElement(By.xpath("//span/div[@role='presentation'][@class='recaptcha-checkbox-border']")).click();
	
}



@Given("^open the facebook url \"([^\"]*)\"$")
public void open_the_facebook_url(String url) throws Throwable {
	login(url);
	 
     
}

@Given("^wait for sometime for the page to load$")
public void wait_for_sometime_for_the_page_to_load() throws Throwable {
	Thread.sleep(3000);
    
}

@Then("^get the title of the webpage$")
public void get_the_title_of_the_webpage() throws Throwable {
	String str=driver.getTitle();
	System.out.println("Title of the webpage is"+str);
   
}









	
	
	
	
	

}
