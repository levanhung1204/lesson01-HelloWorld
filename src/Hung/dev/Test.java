package Hung.dev;
import java.util.Scanner ;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n ;
		int i =1;
		float tong = 0 ;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so n");
		n = scanner.nextInt();
		for (i= 1; i <= n ; i++) {
			tong+=(float) 1/(2*i);
		}
		System.out.println("Tong day so la: " + tong);
		
		

	}

}
