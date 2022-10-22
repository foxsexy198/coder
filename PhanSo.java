package Buoi2;
import java.util.Scanner;
public class PhanSo {
	private int Tuso, Mauso;
	
	public PhanSo(){
		Tuso = 0;
		Mauso = 0;
	}
	public PhanSo(int tu, int mau){
		Tuso = tu;
		Mauso = mau;
	}
	public void nhapPhanso(){
		do{
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap tu: ");
		Tuso = sc.nextInt();
		System.out.print("Nhap mau: ");
		Mauso = sc.nextInt();
		if(Mauso == 0)
			System.out.print("Nhap sai! Nhap lai");
		}while(Mauso == 0);
	}
	public void hienThi(){
		if(Tuso == 0)
			System.out.println("0");
		else{
			if(Mauso == 1)
				System.out.print(Tuso);
			else
				System.out.println(Tuso + "/" + Mauso);
		}
	}
	public void nghichDao(){
		if(Tuso == 0)
			System.out.println("Khong the nghich dao");
		else{
			int tmp;
			tmp = Tuso;
			Tuso = Mauso;
			Mauso = tmp;
		}
	}
	public PhanSo giaTringhichdao(){
		return new PhanSo(Mauso, Tuso);
	}
	public float giaTrithuc(){
		return (float)Tuso/Mauso;
	}
	public boolean lonHon(PhanSo a){
		boolean flag = false;
		if(Tuso*a.Mauso - a.Tuso*Mauso > 0)
			flag = true;
		return flag;
	}
	
	
	public int UCLN(int a, int b){
		while(b != 0){
			int r = a%b;
				a = b;
				b = r;
		}
		return a;
	}
//	public PhanSo cong(PhanSo a){
//		return new PhanSo((a.Tuso*Mauso + Tuso*a.Mauso)/UCLN(a.Tuso*Mauso + Tuso*a.Mauso,a.Tuso*Mauso + Tuso*a.Mauso), (a.Mauso*Mauso)/UCLN(a.Tuso*Mauso + Tuso*a.Mauso,a.Tuso*Mauso + Tuso*a.Mauso));
//	}
//	public PhanSo tru(PhanSo a){
//		return new PhanSo((Tuso*a.Mauso - a.Tuso*Mauso)/UCLN(a.Tuso*Mauso + Tuso*a.Mauso,a.Tuso*Mauso + Tuso*a.Mauso), (a.Mauso*Mauso)/UCLN(a.Tuso*Mauso + Tuso*a.Mauso,a.Tuso*Mauso + Tuso*a.Mauso));
//	}
//	public PhanSo nhan(PhanSo a){
//		return new PhanSo((Tuso*a.Tuso)/UCLN(Tuso*a.Tuso, Mauso*a.Mauso), (Mauso*a.Mauso)/UCLN(Tuso*a.Tuso, Mauso*a.Mauso));
//	}
//	public PhanSo chia(PhanSo a){
//		return new PhanSo ((Tuso*a.Mauso)/UCLN(Tuso*a.Mauso, Mauso*a.Tuso), (Mauso*a.Tuso)/UCLN(Tuso*a.Mauso, Mauso*a.Tuso));
//	}
	public PhanSo cong(PhanSo a){
		PhanSo b = new PhanSo();
		b.Tuso = Tuso*a.Mauso + a.Tuso*Mauso;
		b.Mauso = Mauso*a.Mauso;
		return  new PhanSo(b.Tuso/UCLN(b.Tuso, b.Mauso), b.Mauso/UCLN(b.Tuso, b.Mauso));
	}
	public PhanSo tru(PhanSo a){
		PhanSo b = new PhanSo();
		b.Tuso = Tuso*a.Mauso - a.Tuso*Mauso;
		b.Mauso = Mauso*a.Mauso;
		return  new PhanSo(b.Tuso/UCLN(b.Tuso, b.Mauso), b.Mauso/UCLN(b.Tuso, b.Mauso));
	}
	public PhanSo nhan(PhanSo a){
		PhanSo b = new PhanSo();
		b.Tuso = Tuso*a.Tuso;
		b.Mauso = Mauso*a.Mauso;
		return  new PhanSo(b.Tuso/UCLN(b.Tuso, b.Mauso), b.Mauso/UCLN(b.Tuso, b.Mauso));
	}
	public PhanSo chia(PhanSo a){
		PhanSo b = new PhanSo();
		b.Tuso = Tuso*a.Mauso;
		b.Mauso = Mauso*a.Tuso;
		return  new PhanSo(b.Tuso/UCLN(b.Tuso, b.Mauso), b.Mauso/UCLN(b.Tuso, b.Mauso));
	}
	
	
	
	
	public PhanSo add(int a){
		PhanSo b = new PhanSo();
		b.Tuso = Tuso + a*Mauso;
		b.Mauso = Mauso;
		return new PhanSo(b.Tuso/UCLN(b.Tuso, b.Mauso), b.Mauso/UCLN(b.Tuso, b.Mauso));
	}
	public PhanSo sub(int a){
		PhanSo b = new PhanSo();
		b.Tuso = Tuso - a*Mauso;
		b.Mauso = Mauso;
		return new PhanSo(b.Tuso/UCLN(b.Tuso, b.Mauso), b.Mauso/UCLN(b.Tuso, b.Mauso));
	}
	public PhanSo mul(int a){
		PhanSo b = new PhanSo();
		b.Tuso = Tuso*a;
		b.Mauso = Mauso;
		return new PhanSo(b.Tuso/UCLN(b.Tuso, b.Mauso), b.Mauso/UCLN(b.Tuso, b.Mauso));
	}
	public PhanSo div(int a){
		PhanSo b = new PhanSo();
		b.Tuso = Tuso;
		b.Mauso = Mauso*a;
		return new PhanSo(b.Tuso/UCLN(b.Tuso, b.Mauso), b.Mauso/UCLN(b.Tuso, b.Mauso));
	}
}
