package Example;

import java.util.Scanner;

public class hoten {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ten cua ban: ");
		String username = scanner.nextLine();
		System.out.println("Nhap tuoi cua ban: ");
		int tuoi = scanner.nextInt();
		System.out.println("Ten cua ban la: " + username);
		System.out.println("Tuoi cua ban la: " + tuoi);
	}
}
