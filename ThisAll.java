package my_package;

public class ThisAll {
	void a(){
		System.out.println("f");
	}
	void b() {
		System.out.println("b");
		this.a();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisAll obj=new ThisAll();
		obj.b();

	}

}
