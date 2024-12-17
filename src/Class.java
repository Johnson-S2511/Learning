class Cal{
	public int add(int a,int b) {
		return a+b;
	}
}
class Student{
	
	
		String name;
		int age;
		int marks;
	
}
public class Class {
	public static void main (String args[]) {
		
		int num1=2;
		int num2 =100;
		Cal calculator= new Cal();
		int result =calculator.add(num1,num2);
		System.out.println(result);
		
		/*------Student Class[Array of Objects]----*/
		Student s1=new Student();
		s1.name="John";
		s1.age=23;
		s1.marks=80;
		
		Student s2=new Student();
		s2.name="Amir";
		s2.age=23;
		s2.marks=100;
		
		Student s3=new Student();
		s3.name="Dhivin";
		s3.age=23;
		s3.marks=95;
		/*Array of Objects */ /*Class name +variable Name[] =new class name*/
		Student stud[]=new Student[3];
		stud[0]=s1;
		stud[1]=s2;
		stud[2]=s3;
		
	//Enhanced for loop
		for(Student s:stud) {
			System.out.println(s.name+" "+s.age+" "+s.marks);
		}
		
		
		
		
		
	}

}
