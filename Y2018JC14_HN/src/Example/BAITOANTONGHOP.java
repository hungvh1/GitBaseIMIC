/*
BÀI TOÁN TỔNG HỢP: Viết 1 chương trình phần mềm tổng hợp với nhiều
tính năng sau:
--- MỜI CHỌN ---
1 - Tính diện tích & chu vi Tam giác.
2 - Tính diện tích & chu vi Hình chữ nhật.
3 - Tính diện tích & chu vi Hình vuông.
4 - Tính cước Taxi.
5 - Giải hệ pt bậc nhất.
6 - Giải phương trình bậc 2.
7 - Thoát chương trình.
Yêu cầu:
- Cho phép người dùng thực hiện liên tục các tính năng.
- Khi muốn dừng chương trình lại chọn mục 7 để thoát.
- Khi người dùng chọn cần xác định tính hợp lệ của giá trị đó và đưa ra thông
báo nếu chọn sai [1-7].
- Khi nhập vào sai kiểu dữ liệu cũng cần đưa ra thông báo.
- Tên ứng dụng: BAITOANTONGHOP
- Sử dụng các kiến thức về cấu trúc lập trình điều khiển để hoàn thành chương
trình này.
 */
package Example;

import java.util.Scanner;

public class BAITOANTONGHOP {
	//Hàm check empty
    static boolean KiemTraEmpty(String sValue){
        return sValue.isEmpty() ? true : false;
 }
    //Hàm kiểm tra kiểu số
    static boolean KiemTraKieuSo(String sValue){
        return sValue.matches("^[-+]?\\d+(\\.\\d+)?$");
}
    //Hàm kiểm tra khoảng giá trị hợp lệ
    static boolean KiemTraPhepToan(byte bValue){
        return (bValue < 1 || bValue > 7) ? false : true;
}   
	public static void main(String[] args) {
		System.out.println("--- MENU CHƯƠNG TRÌNH ---");
		System.out.println("1 - Tính diện tích & chu vi Tam giác.");
		System.out.println("2 - Tính diện tích & chu vi Hình chữ nhật.");
		System.out.println("3 - Tính diện tích & chu vi Hình vuông.");
		System.out.println("4 - Tính cước Taxi.");
		System.out.println("5 - Giải hệ pt bậc nhất.");
		System.out.println("6 - Giải phương trình bậc 2.");
		System.out.println("7 - Thoát chương trình.");
		
		//Hàm nhập
		Scanner sc = new Scanner (System.in);
		System.out.println("Ban chon: ");
		int sValue = sc.nextInt();
		//Tiến hành kiểm tra tình huống có thể xảy ra như sau:
		//+ Tình huống 01: Người dùng không nhập gì
		//+ Tình huống 02: Người dùng nhập dữ liệu không phải kiểu số
		//+ Tình huống 03: Người dùng nhập dữ liệu ngoài khoảng giá trị
		if (KiemTraEmpty(sValue)) {
			System.out.println("Bạn cần nhập vào giá trị.");
		}else {
			if (KiemTraKieuSo(sValue)) {
				byte bValue = 
			}
		}
		
		switch (SValue) {
	
			
		
			
		}
		
		
		
		
		// Hàm tam giác
		static void tamgiac()
		{
			System.out.println("tam giac");
		}
		//Hàm hình chữ nhật
		static void hinhchunhat()
		{
			System.out.println("chu nhat");
		}
		//Hàm hình vuông
		static void hinhvuong()
		{
			System.out.println("hinh vuong");
		}
		//Hàm taxi
		static void taxi()
		{
			System.out.println("taxi");
		}
		//Hàm hệ phương trình bậc nhất
		static void hptbacnhat()
		{
			System.out.println("he bac nhat");
		}
		//Hàm phương trình bậc 2
		static void ptbac2()
		{
			System.out.println("phuong trinh bac 2");
		}
		static void thoat()
		{
			System.out.println("Thoat");
		}
	}

}
