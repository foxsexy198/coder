package Buoi1;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Tong_a_b {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, sum;
		while(true){
			try{
				a = sc.nextInt();
				b = sc.nextInt();
				break;
			}
			catch(InputMismatchException e){
				System.out.println("Loi! Nhap lai: ");
				sc.nextLine();
			}
		}

		sum = a+b;
		System.out.println("sum = " + sum);

	}
}
