package ExecutionEngine;

public class methodparameter {

	public static void multiply(int a,int b)
	{
		int c=a*b;
		System.out.println(c);
	}

	public static void swap(int x,int y) {
		System.out.println("Before swapping the values are"+x+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swapping the values are"+x +y);
	}
	
	
	public static void main(String[] args) {
		 methodparameter.multiply(10, 20);
		 methodparameter.multiply(50, 100);
		 methodparameter.swap(50,200);
		 
		
		
		
	}

}
