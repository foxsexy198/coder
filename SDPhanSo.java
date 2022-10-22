package Buoi2;
import java.util.Scanner;
public class SDPhanSo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PhanSo a = new PhanSo(3, 7);
		PhanSo b = new PhanSo(4, 9);
		a.hienThi();
		b.hienThi();
		
		PhanSo x = new PhanSo();
		x.nhapPhanso();
		PhanSo y = new PhanSo();
		y.nhapPhanso();
		
		x.giaTringhichdao().hienThi();
		
		System.out.print("Tong cua x va y la ");
		x.cong(y).hienThi();
		
		int n = sc.nextInt();
		PhanSo A[];
		A = new PhanSo[n];
		for(int i=0; i<n; i++){
			A[i] = new PhanSo(); 
			A[i].nhapPhanso();
			
		}
		
		PhanSo sum = new PhanSo(0,1);
		for(int i=0; i<n; i++)
			sum = sum.cong(A[i]);
		
		PhanSo Max = A[0];
		for(int i=0; i<n; i++){
			if(A[i].lonHon(Max))
				Max = A[i];
		}
		for(int i=0; i<n-1; i++){
			for(int k=i+1; k<n; k++){
				if(A[i].lonHon(A[k])){
					PhanSo tmp = A[i];
							A[i] = A[k];
							A[k] = tmp;
				}
			}
		}
		
		System.out.println("Tong cua n phan so la ");
		sum.hienThi();
		System.out.println("Phan so lon nhat la ");
		Max.hienThi();
		System.out.println("Danh sach phan so theo thu tu tang dan la: ");
		for(int i=0; i<n; i++)
			A[i].hienThi();
	}

}
