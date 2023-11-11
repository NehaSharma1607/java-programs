package my_package;
abstract class abs{
	protected static int a=5;
	private final int b=9;
	protected static final int c=5;
	abstract void absmethod(); 
	}
abstract class abs2{
	abstract void absmethod2();
}
abstract class abs3 extends abs2{
	abstract void absmethod3();
}
interface inter5{
	static int d=5;
	static final int e=896;
	final int f=85;
	
	void method6();
}
interface inter6{
	void method7();
}
interface inter7 extends inter5,inter6{
	
}

abstract public class AbstactVsInterface {
	abstract void method8();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
