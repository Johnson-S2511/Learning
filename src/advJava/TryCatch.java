package advJava;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
//		int j=18/i;
//		System.out.println(j);
//		System.out.println("Bye..");  // if we can try above line we are having exception so it will stop execute
/* try catch method to handling the exceptions*/	
		int k=0;
		try {
			k=18/i;
		}
		catch (ArithmeticException e) {
			System.out.println("It's not divide by zero");
		}
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(k);
		System.out.println("Bye...");
		
	}

}
