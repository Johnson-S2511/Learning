package advJava;

class A2 implements Runnable{
	public void run() {
		System.out.println("Hi...");
	}
}

class B2 implements Runnable{
	public void run() {
		System.out.println("HiHello...");
	}
}


public class RunnableTest {
	public static void main(String[] args) {
		
		Runnable obj1=new A2();
		Runnable obj2=new B2();
		
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		t1.start();
		t2.start();
		
		
		
		
	}
	
}
