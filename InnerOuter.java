package my_package;

public class InnerOuter {
	int a=52;
	int b=63;
	int c;
	private int d;
	class Inner{
		void method1(){
			c=a+b;
			System.out.println(c);
		}
		 void getValue() {
			 d=10;
		 }
		 void showValue() {
			 getValue();
			 System.out.println(d);
		 }
		 
	}
	private void display() {
		Inner ob=new Inner();
		ob.method1();
	}
	void innerclassmethod() {
		 class Innerclass{ //method local inner class
			 void print() {
				 System.out.println("hi");
			 }
		 }
		 Innerclass obj3=new Innerclass();
		 obj3.print();
	 }
	public static void main(String[] args) {
		InnerOuter obj=new InnerOuter();
		InnerOuter.Inner obj1=obj.new Inner();
		//InnerOuter.Inner obj1=new InnerOuter().newInner()
		obj1.showValue();
		obj.display();
		obj.innerclassmethod();	
		}
}


