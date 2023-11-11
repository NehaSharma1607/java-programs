package my_package;

abstract class abstra{
	public abstract void method();
	void method2() {
		System.out.println("method 2");
	}
}
public class Abstraction extends abstra{
	public void method() {
		System.out.println("method 1");
	}
	void method2() {
		System.out.println("Overriding method 2");
	}

	public static void main(String[] args) {
		abstra obj=new Abstraction();
		obj.method2();
		obj.method();
	}

}
