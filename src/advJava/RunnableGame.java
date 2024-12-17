package advJava;

class Counter{
	int Count=0;
	public void count(){
		Count++;
	}
}
public class RunnableGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter ct=new Counter();
		Runnable obj7=new Runnable()
		{
			public void run() {
				for(int i=0;i<5;i++) {
				ct.count();
				}
			}
		};
		Runnable obj2=new Runnable()
		{
			public void run() {
				for(int i=0;i<5;i++) {
				ct.count();
				}
			}
		};
		Thread t1=new Thread(obj7);
		t1.start();
		System.out.println(ct.Count);
	}
	

}
