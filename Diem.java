package Buoi2;
import java.util.Scanner;
public class Diem {
	private int x, y;
	
	public Diem(){
		x = 0;
		y = 0;
	}
	public Diem(int x1, int y1){
		x = x1;
		y = y1;
	}
	public void nhapDiem(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap x ");
		x = sc.nextInt();
		System.out.print("Nhap y");
		y = sc.nextInt();
	}
	public void hienThi(){
		System.out.println("(" + x + "," + y + ")");
	}
	public void doiDiem(int dx, int dy){
		x = x + dx;
		y = y + dy;
	}
	public int giaTriX(){
		return x;
	}
	public int giaTriY(){
		return y;
	}
	public float khoangCach(){
		return (float) Math.sqrt(x*x+y*y);			
	}
	public float khoangCach(Diem a){
		return (float) Math.sqrt(Math.pow(x-a.x, 2) + Math.pow(y-a.y, 2));
	}
	public Diem doiXung(){
		return new Diem(-x, -y);
	}
}
