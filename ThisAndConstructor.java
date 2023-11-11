package my_package;

public class ThisAndConstructor {
	int a,b,c;
	ThisAndConstructor(){
		this(3,8,9);
		System.out.println("Unparametrized constructor");
	}
	ThisAndConstructor(int a, int b,int c){
		//this();
		this.a=a;
		this.b=b;
		this.c=c;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}
	public static void main(String[] args) {
		ThisAndConstructor obj=new ThisAndConstructor();
		
	}
}
