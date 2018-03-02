package Example;

import java.util.Scanner;

public class Example05 {
	public static void main(String[] args) {
		//1. Mời nhập số a,b
		Scanner sc = new Scanner(System.in);
		System.out.println("Mời nhập số a? [0-9]: ");
		float a = sc.nextFloat();
		System.out.println("Mời nhập số b? [0-9]: ");
		float b = sc.nextFloat();
		System.out.println("- Mời bạn chọn phép tính toán. Gồm:\n" + 
	            "          --> 0: Tính tổng.\n" + 
	            "          --> 1: Tính hiệu \n" + 
	            "          --> 2: Tính tích \n" + 
	            "          --> 3: Tính thương");
	    byte bOptions = sc.nextByte();

	    //2. Tiến hành tính toán theo sự lựa chọn của người dùng và đưa ra 
	    //thông báo kết quả
	    if(bOptions < 0 || bOptions > 3)
	        System.out.println("Bạn cần chọn lại [0-3]");
	    else {
	        if(bOptions == 0)
	            System.out.println("- Tổng là: "+ (a + b));
	        else if(bOptions == 1)
	            System.out.println("- Hiệu là: "+ (a - b));
	        else if(bOptions == 2)
	            System.out.println("- Hiệu là: "+ (a * b));
	        else if(bOptions == 3) {
	            if(a==0 && b==0)
	                System.out.println("Result is undefined");
	            else if(a != 0 && b == 0)
	                System.out.println("Cannot divide by zero");
	            else
	                System.out.println("- Thương là: "+ (a / b));
	        } 
		
	}

	}
}
