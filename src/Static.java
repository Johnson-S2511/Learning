
class Bike{
		String Name;
		int price;
		int Model;
		
		public void show(){
			System.out.println(Name+" : "+ price+" : "+Model+" : ");
		}
		
	}
class Phone{
	   String Name;

	int price;
	int Model;
	
	public void show(){
		System.out.println(Name+" : "+ price+" : "+Model+" : ");
	}
	public static void show1(Phone obj) {
		System.out.println("Static Method "+ obj.Name+" : "+obj.price);
	}
	
}
public class Static {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike obj1=new Bike();
		obj1.Name="FZS-V4";
		obj1.price=15000;
		obj1.Model=2023;
		
		Bike obj2=new Bike();
		obj2.Name="R15-V3";
		obj2.price=150000;
		obj2.Model=2020;
		
		obj1.show();
		obj2.show();
		
		/**-----Using static we can call class name--**/
		
		Phone obj3=new Phone();
		obj3.Name="Mi";
		obj3.price=15000;
		obj3.Model=2024;
		
		Phone obj4=new Phone();
		obj4.Name="Realme";
		obj4.price=18000;
		obj4.Model=2020;
		
		//obj3.Name="John";// It will affect all the obj variables we can change the value using obj
		obj3.show();
		obj4.show();
		
		//Phone1.Name="Apple";// It will not affect all the obj particular obj
		obj3.show();
		obj4.show();
		
		//Phone.Name="mohan";
		/*----Call Static method-----*/
		//ClassName.MethodName(Which object)
		
		Phone.show1(obj4);
		

	}

}
