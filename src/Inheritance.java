
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InhCal obj=new InhCal();// Normal method old 
		int a1=obj.add(2,3);
		System.out.println(a1);
		
		InhAdvCal obj1 =new InhAdvCal();//  using Inheritance we can use our old method along with new features
		int b1=obj1.add(3, 4);
		int b3=obj1.mul(4, 5);
		
		System.out.println("Inheritance: "+b1+" "+b3);
		
		IncVeryAdvCal obj2=new IncVeryAdvCal();
		int c=obj2.add(2, 3);
		int c1=obj2.mul(2, 3);
		double c2=obj2.powerCal(2, 3);
		System.out.println("Very Advance Calculator using Multi Level Inheritance---");
		System.out.println("Add: "+c1+" Multiplication: "+c1+" Power: "+c2);

	}

}
