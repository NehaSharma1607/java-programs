package my_package;

public class StaticExample {
	static int a;
	static int b;
	
	static void method() {
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		a=5;
		b=6;
		StaticExample obj=new StaticExample();
		method();
	}

}
