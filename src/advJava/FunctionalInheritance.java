package advJava;

@FunctionalInterface  // using this annotation we are able to know the below interface is functional interface

interface Hello{
	void display();
	//void show();  //--if we give more than one method it is not functional interface
}
class Z implements Hello{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Solra..........");
		
	}
	
}


public class FunctionalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Z obj =new Z();
		obj.display();
	}

}
