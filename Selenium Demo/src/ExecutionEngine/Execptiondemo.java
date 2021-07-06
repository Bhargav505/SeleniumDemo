package ExecutionEngine;

public class Execptiondemo {
	public static void main(String[] args) {
		
		
		try {

	int num;
	num=50/0; //Divide by zero exception
  System.out.println(num);
		}catch(Exception e) {
			System.out.println("Exception is "+e);
		}
	}

}
