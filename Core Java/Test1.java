//Tread Creating by Extending the Thread class
class Thread1 extends Thread{
	int i;
	public void run() {
		for(i=1;i<=5;i++) {
			System.out.println(i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class Thread2 extends Thread{
	int i;
	public void run() {
		for(i=6;i<=10;i++) {
			System.out.println(i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class Thread3 extends Thread{
	int i;
	public void run() {
		for(i=11;i<=15;i++) {
			System.out.println(i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		Thread3 t3=new Thread3();
		
		t1.start();
		t2.start();
		t3.start();
	}
}
