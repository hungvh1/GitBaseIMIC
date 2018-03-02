package Example;

import java.util.Scanner;

public class Example03 {
	// Ctrl + Shift + f: căn chỉnh lại mã lệnh
	public static void main(String[] args) {
		// 1. Khai bao cac bien se su dung
		int iRollNo;
		String sFullName;
		String sEmail;
		String sMobile;
		float fMark;
		// 2. Gán giá trị tương ứng cho các biến đó
		// iRollNo = 100;
		// sFullName = "Đinh Tiến Đạt";
		// sEmail = "datt@gmail.com";
		// sMobile = "0909e824284";
		// fMark = (float) 8.5;
		Scanner sc = new Scanner(System.in);
		System.out.println("Mời nhập RollNo: ");
		iRollNo = sc.nextInt();
		sc.nextLine();
		System.out.println("Mời nhập FullName:");
		sFullName = sc.nextLine();
		System.out.println("Mời nhập Email:");
		sEmail = sc.nextLine();
		System.out.println("Mời nhập Mobile:");
		sMobile = sc.nextLine();
		System.out.println("Mời nhập Mark:");
		fMark = sc.nextFloat();
		

		// 3. In ra
		System.out.println("iRollNo = \t" + iRollNo);
		System.out.println("sFullName = \t" + sFullName);
		System.out.println("sEmail = \t" + sEmail);
		System.out.println("sMobile = \t" + sMobile);
		System.out.println("fMark = \t" + fMark);
	}

}
