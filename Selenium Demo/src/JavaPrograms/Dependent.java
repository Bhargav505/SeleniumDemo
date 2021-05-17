package JavaPrograms;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Dependent {
  @Test
  @Parameters({"val1","val2"})
  public void OpenBrowser(int val1,int val2) {
	  System.out.println("This will execute first (Open Browser)");
	  int multi=val1*val2;
	  System.out.println("product of two values"+multi);
  }

  @Test (dependsOnMethods = {"OpenBrowser"})
  public void SignIn() {
   System.out.println("This will execute second (SignIn)");
  }
}
