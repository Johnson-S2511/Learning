import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		/*--------*/
//		int a[]= new int[2];// If we didn't set any value initially it set it to be zero
//		a[0]=4;
//		a[1]=8;
//		int b[]= {4,2};
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
	//	}
		/*----------Multi dimensional Array*/
		Scanner sc =new Scanner(System.in);
		int a[][]=new int [3][4];
		int random =0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<4;j++) {
				a[i][j]=(int)(Math.random()*100);
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}
		for(int i[]: a) {
			for(int m:i) {
				System.out.print(m +" ");
			}
			System.out.println();
		}
		
		
	

	}

}
