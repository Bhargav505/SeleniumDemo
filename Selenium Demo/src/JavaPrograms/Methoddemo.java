package JavaPrograms;

public class Methoddemo {
	
	public static void M1() {
		
		System.out.println("In Static method");
		
	}
	
	public void M2() {
		
		System.out.println("In Non static method");
	}
	
	public static void main(String[] args) {
		
		Methoddemo obj=new Methoddemo();
		Methoddemo.M1(); // M1 is static method
		obj.M2(); //M2 is non static method

	}

}
