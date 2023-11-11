package my_package;

public class Threads extends Thread{
	public void run() {
		System.out.println("thread is running");
	}
	public static void main(String[] args) {
		Threads obj=new Threads();
		obj.start();
	}

}
