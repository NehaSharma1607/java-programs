package my_package;

class A{
	int a=56;
	int b=23;
}
public class Inheritance extends A {
	public static void main(String[] args) {
		Inheritance obj=new Inheritance();
		System.out.println(obj.a+obj.b);
	}
}

