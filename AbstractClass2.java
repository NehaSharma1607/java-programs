package my_package;
abstract class Abstraction2{
	abstract public void method11();
	protected void regularmethod2() {
		System.out.println("protected regular");
	}
}
public class AbstractClass2 extends Abstraction2{
	public void method11() {
		System.out.println("Abstract Public");
	}
	public static void main(String[] args) {
		AbstractClass2 obj=new AbstractClass2();
		obj.method11();
		obj.regularmethod2();
	}

}
