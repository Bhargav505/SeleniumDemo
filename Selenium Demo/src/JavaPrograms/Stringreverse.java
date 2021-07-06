package JavaPrograms;

public class Stringreverse {

	public static void main(String[] args) {
		 
		String str="Java";
		//String reverse
		String reverse=new StringBuffer(str).reverse().toString();
		System.out.println("String before reverse "+str);
		System.out.println("String After reverse "+reverse);
		//Length of the string
		System.out.println("Length of the string "+str.length());
		//Replace
		System.out.println("String replace "+str.replace('a', 'D'));
		//Uppercase
		System.out.println("String Uppercase "+str.toUpperCase());
		
		
//		Input String str= "a1b2c3e6"
//		Output string =abbccceeeeee
//		Find the occurence of the character e-7
		
		
		

	}

}
