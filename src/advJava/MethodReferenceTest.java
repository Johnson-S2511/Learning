package advJava;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class MethodReferenceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> n=Arrays.asList("John","Kevin","Dhivin","Vignesh");
		
//		List<String> n1=n.stream()
//						.map(i-> i.toUpperCase())
//						.toList();
//		
//		n1.forEach(i-> System.out.println(i));
//		}

	
	
	//Alter Method----------// using Method Reference
	
	List<String> n2=n.stream()
			.map(String::toUpperCase)  //[String is a type of method then :: give operation]
			.toList();
	n2.forEach(i-> System.out.println(i));
}

}

