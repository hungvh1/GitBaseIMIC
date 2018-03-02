package BTVN_01;

import java.util.Scanner;

//Tính tổng bình phương của 2 số
public class Bai07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Nhap so thu nhat:");
		int a = sc.nextInt();
		System.out.println("Nhap so thu hai:");
		int b = sc.nextInt();
		System.out.println("Tổng bình phương của hai số là: " + (a*a+b*b));
	}

}
