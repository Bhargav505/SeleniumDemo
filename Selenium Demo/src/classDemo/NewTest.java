package classDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test 
  public void Test() {
	  System.out.println("In Test method");	 
  }
  @BeforeMethod
  public void beforeMethod() {
System.out.println("In Beforemethod");
  }
  @AfterMethod
  public void afterMethod() {
	  System.out.println("In Aftermethod");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("In Beforeclass");
  }
  @AfterClass
  public void afterClass() {
	  System.out.println("In Afterclass");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("In BeforeTest");
  }
  @AfterTest
  public void afterTest() {
	  System.out.println("In AfterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("In Beforesuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("In Aftersuite");
  }

}
