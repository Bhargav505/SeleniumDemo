package ExecutionEngine;

public class Methoddemo {
	
public static void display() { // Display is a static method belongs to main class
		
		System.out.println("This is a Static method");
	}
	
	public void show() {  //show is a non static method
		System.out.println("This is a Non Static method");
		
	}
	
	public static void main(String[] args) { 
		Methoddemo.display(); //ClassName.Methodname
		
		Methoddemo obj=new Methoddemo(); // Non static Create object
		obj.show();
		
	}

}
