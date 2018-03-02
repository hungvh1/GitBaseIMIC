package BTVN_01;
import java.util.Formatter;
import java.util.Scanner;
//Giải phương trình bậc 2
public class Bai12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Nhập các hệ số a, b, c
		System.out.println("Nhap cac he so a,b,c:");
		System.out.println("a: ");
		float a = sc.nextInt();
		System.out.println("b: ");
		float b = sc.nextInt();
		System.out.println("c: ");
		float c = sc.nextInt();
		if (a == 0) {
			if (b == 0)
				System.out.println("Phuong trinh vo nghiem");
			else
				System.out.println("Nghiem cua phuong trinh la: " + (float) c / b);
		} else {
			float delta = b * b - 4 * a * c;      
			if (delta < 0)
				System.out.println("Phuong trinh vo nghiem");
			else if (delta == 0)
				System.out.println("Phuong trinh co nghiem kep x= " + (float) -b / 2 * a);
			else {
				float x1 = (float) (-b - Math.sqrt(delta)) / (2 * a);
				float x2 = (float) (-b + Math.sqrt(delta)) / (2 * a);
				System.out.println("Phuong trinh co 2 nghiem phan biet x1, x2 la: " + String.format("%d.2f", x1) + " và " + String.format("%d.2f",x2) + "");
			}
		}
	}
}
