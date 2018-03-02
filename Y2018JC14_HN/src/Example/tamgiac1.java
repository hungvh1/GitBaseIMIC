package Example;

import java.util.Scanner;

public class tamgiac1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Nhap canh thu nhat:");
		float a = sc.nextFloat();
		System.out.println("Nhap canh thu hai:");
		float b = sc.nextFloat();
		System.out.println("Nhap canh thu ba:");
		float c = sc.nextFloat();
		if (((a+b)>c) && ((b+c)>a) && ((c+a)>b))
		{
			System.out.println("Day la tam giac");
			float p = (float) (a+b+c)/2;
			float s = (float) Math.sqrt(p*(p-a)*(p-b)*(p-c));
			System.out.println("Chu vi tam giac la: " + 2*p);
			System.out.println("Dien tich tam giac la: " +s);
		}
		else System.out.println("Day khong la tam giac");					
	}
}
