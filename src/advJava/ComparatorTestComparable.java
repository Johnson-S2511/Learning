package advJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Student implements Comparable<Student>{ // comparable must have compare to method
	int age;
	
	
	String name;
	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Student o) {
		if(this.age>o.age) {
			return 1;
		}
		else
			return -1;
	}
}
public class ComparatorTestComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//If we use single sort give class to handle all the power to sorting at the time use comparable
		
//		Comparator<Integer> com=new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				// TODO Auto-generated method stub
//				if(o1%10>o2%10) {
//					return 1;  // 1 means it will swap
//				}
//				else
//					return -1; //-1 means it's not swap
//			}
//		};
		List<Student> x=new ArrayList<Student>(); // use student we can use Student type
//		x.add(39);
//		x.add(56);
//		x.add(98);
//		x.add(90);
//		Collections.sort(x,com);  // if we sort using last digit use comparator
//		System.out.println(x);
		
//		---------Comparable----
		x.add(new Student(16, "John"));
		x.add(new Student(15, "Ducky"));
		x.add(new Student(10, "Mapla"));
		x.add(new Student(18, "Kevin"));
		
		Collections.sort(x);
		
		for(Student stud:x) {
			System.out.println(stud);
		}

		
		
	}

}
