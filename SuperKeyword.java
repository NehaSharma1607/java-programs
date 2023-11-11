package my_package;
class ColorA{
	String color="red";
	void display() {
		System.out.println("ColorA");
	}
	}
public class SuperKeyword extends ColorA{
	String color="Blue";
	void display2() {
		System.out.println("SuperKeyword");
	}
	void test() {
		super.display();
		}
	void display(){
		System.out.println(color);
		System.out.println(super.color);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperKeyword obj=new SuperKeyword();
		obj.display2();
		obj.test();
	}

}
