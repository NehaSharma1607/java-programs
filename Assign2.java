package my_package;

public class Assign2 {
	private int outer=10;
	void outermethod() {
		int localvar=20;
		class MLInnerClass{
			void innermethod() {
				System.out.println("private variable: "+outer);
			}
		}
		MLInnerClass obj2=new MLInnerClass();
		obj2.innermethod();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assign2 obj=new Assign2();
		//access a private variable of an outer class from 
		//an inner class in the main method of outer class.
		System.out.println(obj.outer);
		//Access a private variable from a method local inner class
		obj.outermethod();

	}
}

