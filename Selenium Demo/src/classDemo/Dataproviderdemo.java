package classDemo;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Dataproviderdemo {
  @Test(dataProvider = "value")
  public void Divide(int val1, int val2) {
	  int val3=val1/val2;
	  System.out.println("Divide by value is"+val3);
  }

  @DataProvider
  public Object[][] value() {
    return new Object[][] {
      new Object[] {100,5},
  
    };
  }
}
