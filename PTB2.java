package Buoi1;
import java.util.Scanner;
public class PTB2 {
	public static void Bac1(int a, int b){
		if(a==0)
			System.out.println("Phuong trinh vo so nghiem");
		else
			System.out.println("Phuong trinh co nghiem duy nhat: x = " + (-b/a));
	}
	public static void Bac2(int a, int b, int c){
		int  delta = (b*b) - (4*a*c);
		if(a==0)
			Bac1(b,c);
		else{
			if(delta > 0){
				System.out.println("Phuong trrinh co 2 nghiem phan biet:");
				System.out.println("x1 = " + (-b+Math.sqrt(delta))/(2*a));
				System.out.println("x2 = " + (-b-Math.sqrt(delta))/(2*a));
			}
			else if(delta == 0)
				System.out.println("Phuong trinh co nghiem kep: x1 = x2 = " + (-b/(2*a)));
			else
				System.out.println("Phuong trinh vo nghiem");
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		Bac2(a,b,c);
		
	}
}
