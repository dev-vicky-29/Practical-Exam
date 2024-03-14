class Runnable1 implements Runnable{
	int i;
	public void run() {
		for(i=1;i<=5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class Runnable2 implements Runnable{
	int i;
	public void run() {
		for(i=6;i<=10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class Runnable3 implements Runnable{
	int i;
	public void run() {
		for(i=11;i<=15;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable1 r1=new Runnable1();
		Runnable2 r2=new Runnable2();
		Runnable3 r3=new Runnable3();
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		Thread t3=new Thread(r3);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
