package BTVN_01;

import java.util.Scanner;

//Tìm giá trị lớn nhất trong hai số
public class Bai08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Nhap so thu nhat:");
		int a = sc.nextInt();
		System.out.println("Nhap so thu hai:");
		int b = sc.nextInt();
		int max = a;
		if (max<b) max=b;
		System.out.println("Số lớn nhất trong 2 số là: " + max);
	}

}
