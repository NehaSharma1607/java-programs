package my_package;

public class BoxingUnboxing {

	public static void main(String[] args) {
		int a=10;
		Integer i=new Integer(a); //Boxing
		int b= Integer.valueOf(i);//Unboxing
		System.out.println(a);
		System.out.println(i);
		System.out.println(b);
		Character c='a';//AutoBoxing
		char d=c;//AutoUnboxing
		System.out.println(c);
		System.out.println(d);
	}

}
