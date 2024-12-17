import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		
		int x=10;
		//System.out.println("What is your Name");
		
		Scanner a= new Scanner(System.in);
		//System.out.println(a.next());
//		int b1=a.nextInt();
//		int[] a1=new int[b1];
//		for(int i=0;i<b1;i++)
//		{
//			a1[i]= a.nextInt(); 
//		}
		
		String [] sapadu= new String[3];
		
		
		
		for(int i=0;i<sapadu.length;i++) {
			System.out.print("Enter your" +(i+1)+ "sapaduList:");
			sapadu[i]=a.nextLine();
			}
		System.out.println("Avalotha pa....Kasu ila unda.!");
		for(int i=0;i<sapadu.length;i++) {
			System.out.print(sapadu[i]);
			
		}
		
		
	}

}

