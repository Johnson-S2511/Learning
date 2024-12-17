package advJava;

class A{                        // outer class is non static here we didn't use static class
	int age;
	public void show() {
		System.out.println("Show....");
	}
	class B{                                  // Inner class - Static use
		public void hello() {
			System.out.println("Inner class hello");
			}
	}
}

public class InnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A obj=new A();
		obj.show();
		
	//	B obj2 new B(); - cannot create obj of B because it is inside A class
		
		A.B obj1= obj.new B(); // A.B --> B class represent inside of A class [obj.new B()]--> we cannot create obj of B but we can create with the reference  object of A so Obj.new 
		 obj1.hello();
		// if inner class is static below format to create object
		//A.B obj2 =new A.B();
	}

}
