package my_package;

public class StaticVariable {
	static int a=5;
	int b;
	void method() {
		a++;
	}
	void method1() {
		b++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariable obj=new StaticVariable();
		StaticVariable obj1=new StaticVariable();
		obj.method();
		obj1.method();
		obj.b=9;
		obj1.b=10;
		obj.method1();
		obj1.method1();
		System.out.println(a);
		System.out.println(obj.a);
		System.out.println(obj1.a);
		System.out.println(obj.b);
		System.out.println(obj1.b);



	}

}
