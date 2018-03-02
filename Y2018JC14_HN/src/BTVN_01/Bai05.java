package BTVN_01;

import java.util.Scanner;

//Giải hệ phương trình bậc nhất
public class Bai05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		//Nhập hệ số phương trình thứ 1
		System.out.println("Nhập các hệ số phương trình thứ nhất: ");
		System.out.println("a= ");
		float a = sc.nextFloat();
		System.out.println("b= ");
		float b = sc.nextFloat();
		System.out.println("c= ");
		float c = sc.nextFloat();
		//Nhập hệ số phương trình thứ 2
		System.out.println("Nhập các hệ số phương trình thứ hai: ");
		System.out.println("d= ");
		float d = sc.nextFloat();
		System.out.println("e= ");
		float e = sc.nextFloat();
		System.out.println("f= ");
		float f = sc.nextFloat();
		//Tính các hệ số D
		float D = a*e-b*d;
		float Dx = c*e-b*f;
		float Dy = a*f-c*d;
		if (D==0)
		{
			if (Dx==0) System.out.println("Hệ phương trình vô số nghiệm");
			else System.out.println("Hệ phương trình vô nghiệm");
		}
		else 
		{
			float x = (float) Dx/D;
			float y = (float) Dy/D;
			System.out.println("Hệ có nghiệm duy nhất là: x= "+x+" và y="+y+"");
		}							
	}
}
