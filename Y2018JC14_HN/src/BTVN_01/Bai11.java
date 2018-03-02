package BTVN_01;

import java.util.Scanner;

//Giải phương trình bậc nhất
public class Bai11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Nhap hệ số a khác 0:");
		int a = sc.nextInt();
		System.out.println("Nhap hệ số b:");
		int b = sc.nextInt();
		System.out.println("Nghiệm của phương trình là: " + (float) -b/a);
	}

}
