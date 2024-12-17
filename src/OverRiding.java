/*Method Overriding*/
class Calculator{
	public int add(int a,int b) {
		return (a+b);
	}
}
class NewCalculator extends Calculator{  //Same method name with same parameter with different behaviour (advance Update) is called Method Overriding
	public int add(int a,int b) {
		return (a+b+1);
	}
}

public class OverRiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NewCalculator obj6=new NewCalculator();
		int op=obj6.add(3, 7);
		System.out.println(op);
	}
}
