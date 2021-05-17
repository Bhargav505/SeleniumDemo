package JavaPrograms;

class Animal{
	void eat()
	{
		System.out.println("Eating");
	}
	
}

class dog extends Animal{
	void bark() {
		System.out.println("barking");
	}
}
public class TestInheritance {

	public static void main(String[] args) {
		
		dog obj=new dog();
		obj.bark();
	    obj.eat();
	}

}
