package advJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> name=Arrays.asList("John","Kevin");
		
		
		Optional<String> s=name.stream()  // The result we get at object so we go optional to convert to string 
				.filter(i->i.contains("x"))
				.findFirst();
		
		System.out.println(s.orElse("Not Found...")); // It will give error with our
		
		String s2=name.stream()  // The result we get at a string 
				.filter(i->i.contains("x"))
				.findFirst()
				.orElse("Not Found"); //here itself we generate our error so not using optional 
		
		System.out.println(s2);

	}

}
