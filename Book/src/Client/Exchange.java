package Client;

import java.util.Scanner;

//전화문의 = 교환
public class Exchange extends Call{
	Scanner scanner = new Scanner(System.in);
	Exchange(){
		
	}
	
	Exchange(String name,int Score){
		super(name,Score);
	}
	
	
	
	
	@Override
	String Call() {
		System.out.println("고객 성함 : " + super.getName());
		System.out.println("'" + super.getName() + "' 도서가 교환이 되었습니다.");
		return "name";
	}
	

	void printClient(Client client) {
		System.out.print("고객성함: ");
		String a = scan.nextLine();
		System.out.print("도서명: ");
		String b = scan.nextLine();
		System.out.println("고객성함 : " + a + ", 도서명: " + b);
		System.out.println(a + "고객님의 '" + b + "' 도서가 교환이 되었습니다.");
	}
}
