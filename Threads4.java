package my_package;

public class Threads4 extends Thread{
	public void run() {
		System.out.println("running....");
	}

	public static void main(String[] args) {
		Threads4 obj1=new Threads4();
		Threads4 obj2=new Threads4();
		System.out.println("Name of obj1:"+obj1.getName());
		System.out.println("Name of obj2:"+obj2.getName());
		System.out.println("Id of obj1:"+obj1.getId());

		obj1.start();
		obj2.start();
		obj1.setName("obj3");
		System.out.println("After changing name of obj1:"+obj1.getName());

	}

}
