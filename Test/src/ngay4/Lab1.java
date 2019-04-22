package ngay4;

import java.util.Scanner;

public class Lab1 {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("nhap vao a : ");
		int A = a.nextInt();
		Scanner b = new Scanner(System.in);
		int B = b.nextInt();		
		System.out.println("nhap vao b : ");
	    System.out.println("Tong cua a + b la: " +(A+B));
	    System.out.println("Hieu cua a - b la: " +(A-B));
	    System.out.println("So du cua a/b la : " +(A%B));
	    System.out.println("Thuong cua a/b la : " + (A/B));
	    System.out.println("Tang a len 1 don vi: " + (++A));	    
	    System.out.println(kiemTra(A,B));
	}
	public static String kiemTra(int A, int B) {
		if (A > B) {
			return " a lon hon b";
		}
		 return " a nhon hon b";
		}
	
}