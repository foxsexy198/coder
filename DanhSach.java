package Buoi1;
import java.util.Scanner;
public class DanhSach {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so phan tu cua danh sach");
		int n = sc.nextInt();
		
		int str[] = new int[n];
		System.out.println("Nhap danh sach: ");
		for(int i = 0; i < n; i++)
			str[i] = sc.nextInt();
		
		System.out.println("Nhap x:");
		int x = sc.nextInt();
		int t = 0;
		for(int i = 0; i < n; i++){
			if(str[i] == x)
				t += 1;
		}
		System.out.print("Danh sach ban dau: ");
		for(int i = 0; i < n; i++)
			System.out.print(str[i] + " ");
		
		System.out.println("");
		System.out.println("So phan tu " + x + " co trong danh sach la " + t); 
		
		for(int i = 0; i < n-1; i++){
			for(int j = n-1; j > i; j--){
				if(str[j] < str[j - 1]){
					int tmp = str[j];
					str[j] =  str[j - 1];
					str[j - 1] = tmp;
				}
			}
		}
		System.out.println("Danh sach sau khi sap xep: ");
		for(int i = 0; i < n; i++)
			System.out.print(str[i] + " ");
	}
}
