package Example;
import java.util.Scanner;
public class UCLN_BCNN {
	public static int nhap()
	{
		Scanner sc = new Scanner (System.in);
		int n= 0;
		boolean check = false;
		while (!check)
		{
			try {
				n= sc.nextInt();
				check = true;
			} catch (Exception e)
			{
				System.out.println(" Ban phai nhap so! hay nhap lai...");
				sc.nextLine();
			}
		}
		return(n);
	}
	public static int UCLN (int a, int b)
	{
		while (a!=b)
		{
			if (a>b) a= a-b;
			else b=b-a;
		}
		return(a);
	}
	public static void main (String []args)
	{
		System.out.println("Nhap so a: ");
		int a = nhap();
		System.out.println("Nhap so b: ");
		int b = nhap();
		System.out.println("Uoc chung lon nhat cua hai so la: " + UCLN(a,b));
		System.out.println("Boi chung nho nhat la: " + (a*b)/UCLN(a,b));
	}

}
