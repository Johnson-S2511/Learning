package advJava;
interface X{
	void show();
	void display();
	void run();
}
interface C{
	void run();
}
class B implements X,C{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Show da...");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Display da...");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Run da.....");
	}
	
}


public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X obj= new B();
		obj.run();
		

	}

}
