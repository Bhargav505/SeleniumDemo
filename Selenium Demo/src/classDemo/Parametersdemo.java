package classDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametersdemo {
  @Test
  @Parameters({"val1","val2"})
  public void Divide(int val1,int val2) {
	  
	  int val3=val1/val2;
	  
	  System.out.println("Divided value is "+val3);

	  
  }
}
