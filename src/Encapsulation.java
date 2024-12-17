
class Alien{
	private int age=10;// To access the private variable we have method for setting and getting the value 
	private String name="Dhivin";
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Alien obj=new Alien();
		obj.setAge(23);
		obj.setName("John");
		
		System.out.println(obj.getName()+" : "+obj.getAge());
	
	}

}
