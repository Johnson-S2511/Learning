package advJava;

class A1 extends Thread{  // using thread concept make sure your class extends thread
	public void run(){   // In thread concept we can use run method using start method to call
		for(int i=0;i<=4;i++) {
			 System.out.println("Hi..");
			 try {
					Thread.sleep(3);  // Thread will wait 3 milliseconds to execute 
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}
class B1 extends Thread{
	public void run(){
		for(int i=0;i<=4;i++) {
			 System.out.println("Hello..");
			 try {
				Thread.sleep(3); // Thread will wait 3 milliseconds to execute 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreadPrioritySleep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 obj =new A1();
		B1 obj1=new B1();
		
		System.out.println(obj.getPriority()); // use to get the thread priority normally it's 5 (min 1, max 10)
		
		obj.start();
		try {
			Thread.sleep(5); // Thread will wait 5 milliseconds to execute 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obj1.start();
		
		
		
	}

}
