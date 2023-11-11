package my_package;


public class StaticClass {
	class ExB{
		void method() {
			System.out.println("hiii");
		}
	}
	static class Stat{
		void method2() {
			System.out.println("hellppp");
		}
	}
	static class Star2{
		void method3() {
			System.out.println("new helloo");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticClass.ExB obj= new StaticClass().new ExB();
		obj.method();
		StaticClass.Stat obj1=new Stat();
		obj1.method2();
		StaticClass.Star2 obj2=new Star2();
		obj2.method3();
	}

}
