class A{
	public A() {  // Default Constructor
		super();
		System.out.println("In A");}

	public A(int a) {
		super();
		System.out.println("Values are in A");
	}
}
class B extends A{
	public B() {  // Default Constructor
		super();
		System.out.println("In B");}

	public B(int a) { //Parameterized Constructor
		//super(); // if we pass parameter in Super It will call the super Class Parameter constructor
		this();// This will Execute the constructor of same class without passing Parameter In A and both the B Constructor
		
		System.out.println("Values In B");
	}
}

public class ThisAndSuper {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		B obj=new B(3);
	}

}
