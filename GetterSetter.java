package my_package;

class GetSet{
	private int a, b;
	private void method() {
		System.out.println(a*b);
	}
	void set(int a,int b) {
		this.a=a;
		this.b=b;
		method();
	}
	void get() {
		System.out.println(a);
		System.out.println(b);

	}
}

public class GetterSetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetSet obj=new GetSet();
		obj.set(2, 3);
		obj.get();
	}

}
