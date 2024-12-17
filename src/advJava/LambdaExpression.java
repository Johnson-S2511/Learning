package advJava;
@FunctionalInterface  // Lambda Expresssion is used only for functional interface
interface AB{
	//void show();
	int add(int a,int b);
}

public class LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		AB obj=()->{
//			System.out.println("In Show");
//		};
//     obj.show();
		
		AB obj =(int a, int b)->{
			return a+b;	
		};	
			//Or 
//		AB obj1=(a,b)->a+b;
//		int b=obj1.add(3, 8);	
	
	int a=obj.add(3, 5);
	
	System.out.println(a);

}
}
