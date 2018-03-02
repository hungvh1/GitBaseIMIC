package Example;

import java.util.Scanner;

public class Example04 {
public static void main(String[] args) {
	//1. Khai báo các biến sử dụng
	float a, b;
	
	
	
	//2. Mời người dùng nhập vào 2 số a và b
	Scanner sc = new Scanner(System.in);
	System.out.println("Mời nhập số a:");
	a = sc.nextFloat();
	System.out.println("Mời nhập số b:");
	b = sc.nextFloat();
	//3. Áp dụng tính tổng 2 số a và b
	System.out.println("- Tổng giá trị hai số a và b là: " + (a+b));
	
}
}
