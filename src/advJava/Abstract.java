package advJava;


abstract class Bike {  //Abstract class
	
	public abstract void drive(); // [Define] - Abstract method definitely has an abstract class
	public abstract void gear(); 
     public void Wheeling(){
		System.out.println("Wheeling...");
	}
}
abstract class BMW extends Bike{
	public void drive() {
		System.out.println("BMW Bike is driving...");
	}
	
}

class UpdatedBMW extends BMW{  // concrete class has only implemented the remaining abstract method

	
	public void gear() {
		// TODO Auto-generated method stub
		System.out.println("Gear Unduda........");
	}
	
}

public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//you are able to create only concrete class objects
		
		Bike obj=new UpdatedBMW();  
		obj.drive();  // able to call drive method with the concrete class object
		obj.gear();
		obj.Wheeling();
				
	
	}

}
