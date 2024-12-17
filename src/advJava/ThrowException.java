package advJava;
class JohnException extends Exception{
	
}
public class ThrowException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=20;
		int j=0;
		
		try {
			j=18/20; //==>0 as output
			if(j==0)
				throw new ArithmeticException();
				// customException
//				throw new JohnException();
		}
		// Customized Exception catch
//		catch (JohnException e) {
//			j=18/1;
//			System.out.println("Default value while Johnexception happening..: ");
//		}
		catch (ArithmeticException e) {
			j=18/1;
			System.out.println("Default value while exception happening..: ");
		}
		System.out.println(j);
	}

}
