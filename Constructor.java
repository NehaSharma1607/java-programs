package my_package;

public class Constructor {
	Constructor(){
		System.out.println("No arguement Constructor");
	}
	Constructor(int a){
		System.out.println(a); //parameterized constructor
	}
	void display() {
		System.out.println("default Constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor obj1=new Constructor();
		Constructor obj2=new Constructor(5);
		obj1.display();
	}

}
