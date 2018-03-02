package BTVN_01;

import java.util.Scanner;

//Chuyển đổi độ F sang độ C
public class Bai06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Nhập giá trị độ F:");
		float doF = sc.nextInt();
		float doC = (float) 5*(doF-32)/9;
		System.out.println("Giá trị độ C là: " + doC);
	}
}
