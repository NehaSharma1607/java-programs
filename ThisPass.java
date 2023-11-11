package my_package;

public class ThisPass {
	int a,b;
	ThisPass(){
		a=10;
		b=20;
	}
	void Print(ThisPass obj) {
		System.out.println(obj.a);
		System.out.println(obj.b);
	}
	void get() {
		Print(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisPass obj=new ThisPass();
		obj.get();
	}

}
