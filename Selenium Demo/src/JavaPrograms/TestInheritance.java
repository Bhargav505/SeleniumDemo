package JavaPrograms;

class Vehicle1{ // Parent class or super class
	void Run1()    // Method
	{
		System.out.println("Vehicle is running");
	}
	
}
class Car1 extends Vehicle1{ //child class
	void Run2() {
		System.out.println("Car is Running");
	}
}

class Bike extends Vehicle1{ //child class
	void Run3() {
		System.out.println("Bike is Running");
	}
}
public class TestInheritance {

	public static void main(String[] args) {
		Bike obj=new Bike();
		obj.Run3();
		obj.Run1();
		 
	}

}
