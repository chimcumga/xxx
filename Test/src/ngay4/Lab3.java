package ngay4;

import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner inPut = new Scanner(System.in);
     System.out.println("nhap vao dau so : ");
     int s = inPut.nextInt();
     switch (s) {
     case 1: System.out.println("create employee");break;
     case 2: System.out.println("show the exsting employee");break;
     case 3: System.out.println("exit");break;
     default : System.out.println("Value not found");
     }
	}

}
