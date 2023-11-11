package my_package;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;  
		char b='b';
		Integer i=Integer.valueOf(a);//converting int into Integer 
		Character j=Character.valueOf(b);//converting int into Integer 

		System.out.println("int: "+a);
		System.out.println("Integer: "+i);
		System.out.println("char: "+b);
		System.out.println("Character: "+j);

	}

}
