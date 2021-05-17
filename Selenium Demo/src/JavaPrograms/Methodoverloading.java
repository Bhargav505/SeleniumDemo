package JavaPrograms;

class Add{
	
	public static int add(int a,int b) // two parameters
	{ 
		int c=a+b;
		return c;
		
	}
	public static int add(int a,int b,int c) // three parameters
	{
		int d=a+b+c;
		return d;
	}
	public int add(int a,int b,int c,int d) // fourth parameters
	{
		int E=a+b+c+d;
		return E;
	}
	
}

public class Methodoverloading {

	public static void main(String[] args) {
		System.out.println(Add.add(10, 15));
		 System.out.println(Add.add(10, 15, 25));
		Add obj=new Add();
	System.out.println(obj.add(10, 15, 25,35));
	}
		 
}
