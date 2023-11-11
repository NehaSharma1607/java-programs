package my_package;

public class StaticExample2 {
	int a;
	int b;
	static String c="abc";
	void print(int a,int b,String c) {
		this.a=a;
		this.b=b;
		this.c=c;
		System.out.println(a+" "+b+" "+c);
	}
	public static void main(String[] args) {
		
		StaticExample2 obj1=new StaticExample2();
		StaticExample2 obj2=new StaticExample2();
		StaticExample2 obj3=new StaticExample2();
		obj1.print(obj1.a=5,obj1.b=6,c);
		c="abcd";
		obj2.print(obj2.a=6,obj2.b=7,c);
		obj2.print(obj3.a=7,obj3.b=8,c);
	}

}
