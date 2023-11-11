package my_package;

public class Threads3 extends Thread{
	public void run() {
		for(int i=1;i<5;i++) {
			try {Thread.sleep(500);
		}catch(InterruptedException e) {System.out.println(e);}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threads3 t1=new Threads3();
		Threads3 t2=new Threads3();
		Threads3 t3=new Threads3();
		t1.start();
		try {
			t1.join(1500);
		}catch(InterruptedException e) {System.out.println(e);}
		t2.start();
		t3.start();
		//t1.run();
		//t2.run();
	}

}
