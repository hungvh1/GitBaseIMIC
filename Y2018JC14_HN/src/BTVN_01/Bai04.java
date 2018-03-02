package BTVN_01;

import java.util.Scanner;

//Tính cước taxi
public class Bai04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Nhập quãng đường đi: ");
		float s = sc.nextFloat();
		float money;
		if (s<=1) System.out.println("Số tiền phải trả là: 5000d");
		else if ((s>1)&&(s<=30))
		{
			money = 5000 + (s-1)*4000;
			System.out.println("Giá tiền là: "+money+"d");
		}
		else
		{
			money = 5000 + 30*4000 + (s-31)*3000;
			System.out.println("Giá tiền là: "+ money+"d");
		}
		
			
	
	}
	
}
