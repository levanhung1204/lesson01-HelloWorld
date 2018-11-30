package Hung.dev;

import java.util.Arrays;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		final int SIZE = 5;
		int arr[] = new int[SIZE];
		System.out.println("Nhap vao mot mang so nguyen");
		
		for(int i=0 ; i < SIZE; i++) {
			System.out.println("arr[" + i +"]=");
			arr[i] = scanner.nextInt();
			System.out.println();
			
		}
		System.out.println("Mang vua nhap");
		for(int i=0; i < SIZE; i++) {
			System.out.println("arr[" + i +"]=" + arr[i]);
			System.out.println();
		}
		int max = arr[0];
		int min = arr[0];
		
		for(int i=0 ; i < SIZE ; i++) {
			if ( arr[i] < min ) {
				min = arr[i];
			}
			if (arr[i]> max) {
				max = arr[i];
			}
	   }
		
	   System.out.println(" Phan tu lon nhat trong mang la:" + max);
	   System.out.println(" Phan tu nho nhat trong mang la: "+ min);
	   System.out.println("Mang ban dau la: ");
	   for(int i = 0; i < SIZE; i++) {
		  System.out.println(arr[i]);
		  }
		  
	   Arrays.sort(arr);
	   System.out.println(" Mang sau khi sap xep la: ");
	   for(int i = 0; i < SIZE ; i++) {
		  System.out.println(arr[i]);
			  
	  }
		  
	   int demChan = 0;
	   int demLe = 0;
	   int tongChan = 0;
	   int tongLe = 0;

	   for(int i=0 ; i < SIZE; i++) {
		 if(i % 2 == 0) {
			demChan++;
			tongChan += arr[i];
			}
		 else {
			demLe++;
			tongLe += arr[i];
			}
	   }
	   System.out.println("So luong so chan cua mang la: " + demChan);
	   System.out.println("So luong so le cua mang la: "+ demLe);
	   System.out.println("Tong ca so chan la: " + tongChan );
       System.out.println("Tong ca so le la: " + tongLe);
	  
		
	}


}
