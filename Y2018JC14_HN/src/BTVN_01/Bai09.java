package BTVN_01;

import java.util.Scanner;

//Tìm giá trị lớn nhất của 4 số a,b,c,d
public class Bai09 {
	public static int Max2so (int x, int y)
	{
		int max;
		max = x;
		if (y>max) max= y;
		return (max);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		//nhap cac he so 
		System.out.println("Nhap cac so a,b,c,d:");
		System.out.println("a: ");
		int a = sc.nextInt();
		System.out.println("b: ");
		int b = sc.nextInt();
		System.out.println("c: ");
		int c = sc.nextInt();
		System.out.println("d: ");
		int d = sc.nextInt();
		//Tìm max
		int max1 = Max2so(a,b);
		int max2 = Max2so(c,d);
		int max = Max2so(max1, max2);
		System.out.println("Giá trị lớn nhất trong 4 số là: " +max);			
	}

}
