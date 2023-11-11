package my_package;
class Exp1{
	void display() {
		System.out.println("Outer class");
	}
}
class Exp2{
	void classcreation() {
		Exp1 obj=new Exp1() {
			void display() {
				super.display();
				System.out.println("Inner Anonymous Class");
			}
		};
		obj.display();
	}
}

public class AnonymousInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exp2 ob=new Exp2();
		ob.classcreation();

	}

}
