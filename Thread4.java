package my_package;

public class Thread4 extends Thread{
	public void run() {
		System.out.println("running thread name "
				+ "is: "+Thread.currentThread().getName());
		System.out.println("running thread priority"
				+ " is: "+Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		Thread4 obj=new Thread4();
		Thread4 obj1=new Thread4();
		obj.setPriority(Thread.MIN_PRIORITY);
		obj1.setPriority(Thread.MAX_PRIORITY);
		obj.start();
		obj1.start();
	}

}
