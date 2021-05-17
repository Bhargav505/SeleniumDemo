package JavaPrograms;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Dataprovideedemo {
  @Test(dataProvider = "input")
  public void multiply(Integer val1, int val2) {
	  int val3=val1*val2;
	  System.out.println(val3);
  }

  @DataProvider
  public Object[][] input() {
    return new Object[][] {
      new Object[] {5,10},
       
    };
  }
}	
