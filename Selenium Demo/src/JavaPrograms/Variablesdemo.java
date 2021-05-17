package JavaPrograms;

public class Variablesdemo {
	
		int instance=100;// instance or class variable
		static int m=50;//static variable

		void method(){  
			int local=90;//local variable  
			System.out.println("Local varible"+local);
			System.out.println("class varible"+instance);
			System.out.println("static varible"+m);
			} 
	
		public static void main(String[] args) {
			Variablesdemo v=new Variablesdemo();
			v.method();
			
		}
	}
