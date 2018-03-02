package OOPConcepts.ENCAPSULATION;
import java.util.ArrayList;
import java.util.List;

public class ArrayDemo {
	public static void main(String[] args) {
		//1. Khai báo & khởi tạo mảng đối tượng khách hàng
		List<Customer> lisCust = new ArrayList<Customer>();
		
		//2. Tạo ra 02 đối tượng khách hàng
		Customer oCust01 = new Customer();
		Customer oCust02 = new Customer();
		
		oCust01.iCustId = 100;  //Mã khách hàng là 100
		oCust01.sFullName = "Nguyễn Văn A";
		oCust01.sEmail = "anv@gmail.com";
		oCust01.sMobile = "09877788888";
		
		oCust02.iCustId = 200;  //Mã khách hàng là 100
		oCust02.sFullName = "Trần Thị B";
		oCust02.sEmail = "btt@gmail.com";
		oCust02.sMobile = "09874574754";
		
		//3. Đưa 02 đối tượng kh này vào trong mảng đối tượng kh
		lisCust.add(oCust01);   //oCust01 --> Index = 0
		lisCust.add(oCust02);   //oCust02 --> Index = 1
		
		//4. Hiển thị danh sách các khách hàng
		System.out.println("--- Sử dụng For ---");
		for(int i = 0;i<lisCust.size();i++) {
			Customer oCust = lisCust.get(i);			
			System.out.println("+ Mã khách hàng: "+ oCust.iCustId);
			System.out.println("+ Họ và tên: "+ oCust.sFullName);
			System.out.println("+ Thư điện tử: "+ oCust.sEmail);
			System.out.println("+ Điện thoại: "+ oCust.sMobile);
			System.out.println();
		}	
		}
	}


