package Example;

public class Example06 {
	public static void main(String[] args) {
		//1. KHai báo biến
		int iTemp;
		//2. Gán cho biến 1 thông số
		iTemp = 12;
		//3. Đưa ra các tình huống xử lý
		if (iTemp <=0)
			System.out.println("Frozen");
		else {if(iTemp <= 12)
            System.out.println("Cold");
        else {
            if(iTemp <= 25)
                System.out.println("Warm");
            else {
                if(iTemp <= 75)
                    System.out.println("Hot");
                else {
                    if(iTemp <= 100)
                        System.out.println("Very Hot");
                    else {
                        System.out.println("Burning");
                    }
                }
            }
        }
    }
			
		}
	}


