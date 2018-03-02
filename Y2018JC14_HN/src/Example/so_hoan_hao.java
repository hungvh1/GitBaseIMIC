package Example;
import java.util.Scanner;
public class so_hoan_hao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số nguyên dương n: ");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0)
				sum += i;
		}
		if (n == sum)
			System.out.println("Đây là số hoàn hảo");
		else
			System.out.println("Không là số hoàn hảo");
	}
}
