package advJava;

class AX{
	public void show() throws ClassNotFoundException {
	Class.forName("Hello");
	}
}
public class DuckingException {
	
	static {
		System.out.println("Hi");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AX obj=new AX();
		try {
			obj.show();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

}
