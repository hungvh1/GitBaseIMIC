package Example;

import java.util.Scanner;

public class taxi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap quang duong di:");
		int s = sc.nextInt();
		while (s<=0) 
			{System.out.println(" Moi nhap lai:");
			s = sc.nextInt();
			}
		double price = 0;
		if (s<=1) price =5000;
		else
		{
			int i=s-1;
			if (i<=30) price= 5000 + i*4000;
			else price = 5000 + 30 *4000 + (i-30 )*3000;
		}
		System.out.println("Gia cuoc la:" + (long)price);
	}
}
