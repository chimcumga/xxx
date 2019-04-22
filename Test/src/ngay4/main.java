package ngay4;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner ten = new Scanner(System.in);
    System.out.println("Nhap vao ten: ");
    String myString = ten.nextLine();
    Scanner tuoi = new Scanner(System.in);  
    System.out.println("Nhap vao tuoi: ");
    int myInt = tuoi.nextInt();
    System.out.println("Ten toi la : " +myString );    
    System.out.println("Tuoi cua toi la : " +myInt);
	}

}
