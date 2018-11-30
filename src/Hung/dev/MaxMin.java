package Hung.dev;
import java.util.Scanner;
public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c ;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so a");
		a = scanner.nextInt();
		System.out.println("Nhap so b");
		b = scanner.nextInt();
		System.out.println("Nhap so c");
		c = scanner.nextInt();
		int max = a;
	    if(max < b) {
	        max = b;
	    }
	 
	    if(max < c) {
	        max = c;
	    }
	    System.out.println("Gia tri lon nhat la :" + max);
	    int min = a;
	    if(min>b) {
	    	min = b;
	    }
	    if (min>c) {
	    	min = c ;
	    }
	    System.out.println("Gia tri nho nhat la :" + min);
	    	


	}

}
