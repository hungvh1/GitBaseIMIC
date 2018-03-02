package Example;
import java.util.Scanner;
public class songuyento {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhập số nguyên dương n: ");
	int n = sc.nextInt();
	if (n <= 1)
		System.out.println("Đây không là số nguyên tố cũng không là hợp số");
	else {
		int k = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				k++;
		}
		if (k == 2)
			System.out.println("" + n + " là số nguyên tố");
		else
			System.out.println("" + n + " là hợp số");
	}
}
}
