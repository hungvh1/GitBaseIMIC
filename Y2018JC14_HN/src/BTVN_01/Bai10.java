package BTVN_01;

import java.util.Scanner;

//Kiểm tra sự tồn tại 1 tam giác
public class Bai10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		//nhap cac he so 
		System.out.println("Nhập độ dài các cạnh:");
		System.out.println("Cạnh thứ nhất: ");
		int a = sc.nextInt();
		System.out.println("Cạnh thứ hai: ");
		int b = sc.nextInt();
		System.out.println("Cạnh thứ ba: ");
		int c = sc.nextInt();
		if ((a>=(b+c))||(b>=(a+c))||(c>=(a+b)))
			System.out.println("Đây không là 3 cạnh 1 tam giác");
		else System.out.println(" Đây là 3 cạnh 1 tam giác");
	}
}
