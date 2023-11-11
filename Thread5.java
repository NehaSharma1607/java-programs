package my_package;
class Table{
	synchronized void printTable(int n) {
		for(int i=1;i<=5;i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(400);
			}catch(Exception e) {System.out.println(e);}
		}
	}
}
class ExThread1 extends Thread{
	Table t;
	ExThread1(Table t){
		this.t=t;
	}
	public void run() {
		t.printTable(5);
	}
}
class ExThread2 extends Thread{
	Table t;
	ExThread2(Table t){
		this.t=t;
	}
	public void run() {
		t.printTable(100);
	}
}
public class Thread5 {
	public static void main(String[] args) {
		Table obj=new Table();
		ExThread1 t1=new ExThread1(obj);
		ExThread2 t2=new ExThread2(obj);
		t1.start();
		t2.start();

	}

}
