package my_package;

public class Threads2 extends Thread{
	public void run() {
		for(int i=1;i<5;i++) {
			try {Thread.sleep(500);
		}catch(InterruptedException e) {System.out.println(e);}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threads2 t1=new Threads2();
		Threads2 t2=new Threads2();
		t1.run();
		t2.run();
		t1.start();
		t1.start();
		

	}

}
