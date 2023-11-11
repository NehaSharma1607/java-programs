package my_package;
public class StaticBloack {
	static int a,b;
	static {
		a=10;
		b=20;
	}

	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);

	}

}
