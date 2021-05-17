package JavaPrograms;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Param {
	
	 
  @Test
  @Parameters({"val1","val2"})
  public void Multiply(int val1,int val2) {
		int val3=val1*val2;
	  System.out.println("multiply val1 and val2"+val3);
  }
}
