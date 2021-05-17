package classDemo;

import org.testng.asserts.SoftAssert;

public class softassertdemo {

	public static void main(String[] args) {
		 
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(2<1);
		System.out.println("Assertion failed");
		sa.assertFalse(1<2);
		System.out.println("Assertion failed");
		
		

	}

}
