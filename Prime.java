package Buoi1;
import java.util.Scanner;
public class Prime {
	public static int Check(int n){
		int flag = 1;
		if(n <= 1)
			flag = 0;
		for(int i = 2; i <= Math.sqrt(n); i++){
			if(n%i==0)
				flag = 0;
		}
		return flag;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(Check(n) == 1){
			System.out.println(n + " is a prime");
			System.out.println("Binary nuber of " + n + " la: " + Integer.toBinaryString(n));
		}
		else
			System.out.println(n + " is not a prime");
	}
}
