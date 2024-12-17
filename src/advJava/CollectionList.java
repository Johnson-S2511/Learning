package advJava;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Integer> a=new ArrayList<Integer>(); // Collection <Integer> it will particularly mentioned that we are working with integer
		// Using Collection we didn't get the index
		// using list we are having the index of it
		// List<Integer> b=new ArrayList<Integer>();		
		a.add(3);
		a.add(7);
		a.add(8);
		a.add(3);
		
		System.out.println(a);

	}

}
