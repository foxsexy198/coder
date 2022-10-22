package Buoi1;
import java.util.Scanner;
public class TachTen {
	public static String layten(String hoten){
		hoten = hoten.trim();
		int c = hoten.lastIndexOf(' ');
		return hoten.substring(c+1);	
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String hoten = sc.nextLine();
		System.out.println(layten(hoten));
	}
}
