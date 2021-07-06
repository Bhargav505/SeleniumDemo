package JavaPrograms;

	class Vehicle{   //Parent class 
		
		String void run() {
			
			System.out.println("Vehicle running");
		}
		
	}
	
	class car extends Vehicle{  //child class or subclass
		void run() {
			
			System.out.println("car running");
		}
		}
	
	public class Methodoverriding {

	public static void main(String[] args) {
	 car obj=new car();
	 obj.run();
	 
	}

}
