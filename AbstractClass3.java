package my_package;
abstract class Abstraction3{
	abstract public void method12();
	public void regularmethod1() {
		System.out.println("public regular");
	}
}
public class AbstractClass3 extends Abstraction3{
	public void method12() {
		System.out.println("Abstract public method");
	}
	public void regularmethod1() {
		super.regularmethod1();
		System.out.println("Overriden regular method");
	}
	public static void main(String[] args) {
		AbstractClass3 obj=new AbstractClass3();
		obj.method12();
		obj.regularmethod1();
	}

}
