package my_package;

abstract class AbstractionClass {
	abstract public void method9();
	abstract protected void method10();
}

public class AbstractClass extends AbstractionClass{
	public void method9() {
		System.out.println("public abstract");
	}
	protected void method10() {
		System.out.println("protected abstract");
	}
	public static void main(String[] args) {
		AbstractClass obj=new AbstractClass();
		obj.method10();
		obj.method9();
	}
}
