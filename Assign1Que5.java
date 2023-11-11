package my_package;
class firstclass{
	int a=1;
	void method() {
		System.out.println("Class 1");
	}
	firstclass(){
		char ch='a';
	}
}
class secondclass extends firstclass{
	void method() {
		System.out.println(super.a);
		System.out.println("Class 2");
	}
	secondclass(){
		super();
	}
}
public class Assign1Que5 extends firstclass {
	void method() {
		super.method();
		System.out.println("Class 3");
	}

	public static void main(String[] args) {
		Assign1Que5 obj=new Assign1Que5();
		firstclass obj1=new firstclass();
		obj1.method();
		firstclass obj2=new secondclass();
		obj2.method();
		firstclass obj3=new Assign1Que5();
		obj3.method();

	}

}
