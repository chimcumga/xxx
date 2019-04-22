package ngay4;

import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inPut = new Scanner(System.in);
		System.out.println(" nhap vao  xep loai : ");
		String kt = inPut.nextLine();
		switch (kt) {
		case "A" : System.out.println("xuat sac"); break;
		case "B" : System.out.println("gioi"); break;
		case "C" : System.out.println("kha"); break;
		case "D" : System.out.println("trung binh"); break;
		case "F" : System.out.println("hoc lai"); break;
		default  : System.out.println("khong tim thay ket qua");
		}
		//BSystem.out.println("Diem cua ban la : " +kt);
		

	}

}
