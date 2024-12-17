package advJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=1000;
		List<Integer> nums=new ArrayList<>(size);
		
		Random ran=new Random();// to create random number we are using random 
		for(int i=0;i<size;i++) {
			nums.add(ran.nextInt(100)); //(100) will generate between 100 
		}
		
		System.out.println(nums);
//if you want all the value to multiply by 2 and add all the value
		
		int normalMethod=nums.stream()
				.map(n->n*2)
				.reduce(0, (c,e)->c+e);
		
		System.out.println(normalMethod);
		
		// use MaptoInt without use reduce method
		long startSeq=System.currentTimeMillis();
		int normalMethod1=nums.stream()
				.map(n->n*2)
				.mapToInt(i->i) // it will generate all the value to int format
				.sum();  // it will sum all the value using inputStream
		long endSeq=System.currentTimeMillis();
		int diff=(int) (endSeq-startSeq); // calculate the execution time of this method
		System.out.println(normalMethod1);
		
		//Parallelstream working
		long startParallelseq=System.currentTimeMillis();  // currentTimeMills is use to calculate the execution time 
		int normalMethod2=nums.parallelStream()  // parallel stream work multiple threads
				.map(n->n*2)
				.mapToInt(i->i) // it will generate all the value to int format
				.sum();  // it will sum all the value using inputStream
		
		long endParallelseq=System.currentTimeMillis();
		int diffPara=(int) (endParallelseq-startParallelseq); // calculate the execution time of this method
		System.out.println(normalMethod2);
		
		System.out.println("Execution :NormalStream : "+diff+" parallelStream execution: "+diffPara);

	}

}
