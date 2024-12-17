package advJava;

import java.util.Arrays;
import java.util.List;

class Student1{
	private String name;
	private int age;
	public Student1() {
		
	}
	public Student1(String name) {
		
		this.name = name;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student1 [name=" + name + ", age=" + age + "]";
	}
	
	
}
public class ConstrucorReferenceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> name=Arrays.asList("John","Kevin","Vignesh","Dhivin");
		
		List<Student1> students=name.stream()  // with stream we 
				.map(Student1::new)  // using constructor reference (without this .map(i->new Student1(i)))
				.toList();
		
		students.forEach(i-> System.out.println(i));
	}

}
