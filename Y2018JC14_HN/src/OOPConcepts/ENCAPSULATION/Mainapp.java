package OOPConcepts.ENCAPSULATION;

import java.util.Scanner;

public class Mainapp {
	public static void main(String[] args) {
		//1. Nhập thông tin khách hàng
		Scanner sc = new Scanner(System.in);		
		System.out.println("Số khách hàng là: ");
		int n = sc.nextInt();
		for (int i=0; i<n; i++) {
			System.out.println("---- Khách hàng thứ "+i+" " ----");
			System.out.println("+ Mã khách hàng: "+ oCust01.iCustId);
			System.out.println("+ Họ và tên: "+ oCust01.sFullName);
			System.out.println("+ Thư điện tử: "+ oCust01.sEmail);
			System.out.println("+ Điện thoại: "+ oCust01.sMobile);		
		}	
		//4. Hiển thị thông tin các khách hàng
		

			
	}

	

}
