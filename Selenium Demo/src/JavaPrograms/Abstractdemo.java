package JavaPrograms;


abstract class Bike{
 
	abstract void run();
	abstract void check();
	public void display() {
		System.out.println("In Non abstract method");
	}
}

class honda extends Bike{

	void run() {
		 System.out.println("In abstract method running");
		
	}
	void check() {
		System.out.println("In abstract method checked");
	}
	
}
class hero extends Bike{

	void run() {
		 System.out.println("In abstract method Hero running");
		
	}
	void check() {
		System.out.println("In abstract method Hero checked");
	}
	
}



public class Abstractdemo {

	public static void main(String[] args) {
		 Bike obj=new honda(); 
		 obj.run();
		 obj.check();
		 obj.display();
		 Bike obj1=new hero(); 
		 obj1.check();
		 obj1.run();

	}

}
