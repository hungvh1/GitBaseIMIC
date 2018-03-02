package BTVN_01;

import java.util.Scanner;

public class Bai01_03 {
	public static void main(String[] args) {
		String object;
		System.out.println("Mời nhập hình cần tính [triangle/rectangle/square]");
		Scanner sc = new Scanner (System.in);
		object = sc.nextLine();
		switch (object)
		{
		case "triangle":
		{
			System.out.println("Mời nhập 3 cạnh:");
			System.out.println("Cạnh thứ nhất: ");
			float a =sc.nextFloat();
			System.out.println("Cạnh thứ hai: ");
			float b =sc.nextFloat();
			System.out.println("Cạnh thứ ba: ");
			float c =sc.nextFloat();
			float p = (a+b+c)/2;
			float area = (float) Math.sqrt(p*(p-a)*(p-b)*(p-c));
			System.out.println("Chu vi tam giac la:" + p);
			System.out.println("Dien tich tam giac la:" + area);
			break;
		}
		case "rectangle":
		{
			System.out.println("Mời nhập kích thước:");
			System.out.println("Chiều dài: ");
			float a =sc.nextFloat();
			System.out.println("Chiều rộng: ");
			float b =sc.nextFloat();
			System.out.println("Chu vi hinh chu nhat la:" + ((a+b)*2));
			System.out.println("Dien tich hinh chu nhat la:" + (a*b));
			break;
		}
		case "square":
		{
			System.out.println("Mời nhập độ dài cạnh:");
			System.out.println("Cạnh: ");
			float a =sc.nextFloat();
			System.out.println("Chu vi hinh chu nhat la:" + (a*4));
			System.out.println("Dien tich hinh chu nhat la:" + a*a);
			break;
		}
		default:
			System.out.println("Gia tri nhap khong dung");
	}
	}
}
