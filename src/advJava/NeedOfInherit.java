package advJava;

abstract class Computer{
	public void display() {
		
	}
}
class Laptop extends Computer{
	public void display() {
		System.out.println("In Laptop.....");
	}
}
class Desktop extends Computer{
	public void display() {
		System.out.println("In desktop....");
	}
}
class YourOpt {
	public void opt(Computer com) {
		com.display();
	}
}

public class NeedOfInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Computer lap=new Laptop();
			Computer desk=new Desktop();
			YourOpt out=new YourOpt();
			out.opt(desk);
			
	}

}
