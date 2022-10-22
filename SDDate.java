package Buoi2;
import java.util.Scanner;
public class SDDate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date A = new Date(19, 8, 2003);
		A.hienThi();
		Date B = new Date();
		B.nhapDate();
		B.hienThi();
		
		B.ngayHomsau().hienThi();
		Date C = new Date();
		C.nhapDate();
		int n = sc.nextInt();
		C.congDate(n).hienThi();

	}

}
