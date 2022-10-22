package Buoi2;
import java.util.Scanner;
public class Date {
	private int  d, m, y;
	
	public Date(){
		d = 1;
		m = 1;
		y = 1;
	}
	public Date(int d1, int m1, int y1){
		d = d1;
		m = m1;
		y = y1;
	}
	public boolean hopLe(){
		boolean flag = false;
		int Maxd[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if(y%400==0 || y%4==0 && y%100!=0)
			Maxd[2] = 29;
		if(y > 0 && m > 0 && m < 13 && d > 0 && d <= Maxd[m])
			flag = true;
		return flag;
	}
	public void nhapDate(){
		Scanner sc = new Scanner(System.in);
		do{
			System.out.print("Nhap ngay: ");
			d = sc.nextInt();
			System.out.print("Nhap thang: ");
			m = sc.nextInt();
			System.out.print("Nhap nam: ");
			y = sc.nextInt();
			if(!hopLe())
				System.out.println("Nhap sai! Nhap lai");
		}while(!hopLe());
	}
	public void hienThi(){
		System.out.println(d + "/" + m + "/" + y);
	}
	public Date ngayHomsau(){
		d++;
		if(! hopLe()){
			d = 1;
			m++;
			if(!hopLe()){
				m = 1;
				y++;
			}
		}
		return new Date(d, m, y);
	}
	public Date congDate(int n){
		Date tmp = new Date(d, m, y);
		for(int  i = 0; i < n; i++){
			tmp = tmp.ngayHomsau();
		}
		return tmp;
	}
	
}
