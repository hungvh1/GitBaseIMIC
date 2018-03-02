package Example;

public class Example07 {
	public static void main(String[] args) {
		//1. Khai báo biến
		int itemp;
		//2. Gán cho biến 1 thông số
		itemp = 80;
		//3. Đưa ra các tình huống có thể xảy ra và phương án xử lý
		if (itemp<=0)
			System.out.println("Fozen");
		else if (itemp <=12)
			System.out.println("Cold");
		else if (itemp <=25)
			System.out.println("Warm");
	    else if (itemp <= 75)
	        System.out.println("Hot");
	    else if (itemp <= 100)
	        System.out.println("Very Hot");
	    else
	        System.out.println("Burning");

	}
	}


