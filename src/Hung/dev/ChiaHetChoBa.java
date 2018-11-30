package Hung.dev;
import java.util.Scanner;
public class ChiaHetChoBa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n ;
		int tong = 0;
		int i=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap n");
		n = scanner.nextInt();

		for(i=0;i<=n;i++) {
			if(i%3==0) {
				tong+=i;
				continue;
			}
		}
		System.out.println("Tong cac so chia het cho 3 la :" + tong);
		

	}

}
