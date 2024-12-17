


class Counter{
	public static  int Count=0;
	public synchronized void count(){
		 System.out.println(Count=Count+1);;
	}
}
public class RunnableGaming {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Counter ct=new Counter();
		Runnable obj7=new Runnable()
		{
			public void run() {
				for(int i=0;i<1000;i++) {
				ct.count();
				}
			}
		};
		Runnable obj2=new Runnable()
		{
			public void run() {
				for(int i=0;i<100;i++) {
				ct.count();
				}
			}
		};
		Thread t1=new Thread(obj7);
		Thread t2=new Thread(obj2);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		try {
			Thread.sleep(50);
			int b=ct.Count;
			System.out.println("Value of count :"+b);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
