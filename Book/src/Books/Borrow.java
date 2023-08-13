package Books;

import java.util.ArrayList;
import java.util.Scanner;

public class Borrow extends Library{
	static final int Borrow_time = (int)(Math.random()*6+1);
	static ArrayList <String> BookList = new ArrayList<>();
	static Scanner scan = new Scanner(System.in);
	
	Borrow(){
		BookList.add("도서관에 간 사자");
		BookList.add("실수쟁이 꼬마 돼지의 하루");	
		BookList.add("밤의 도서관");	
		BookList.add("사서e마을 이야기");	
	}
	Borrow(String name){
		super(name);
	}
	Borrow(String name, int Borrow_time){
		super(name);
	}
	
	void Bookremove(Borrow remove) {
			
		System.out.println("*****도서 목록*****");
//		int i = BookList.size();
		for(int i = 0; i< BookList.size();i++) {
			System.out.println("'" + BookList.get(i) + "'");
		}
//		Borrow();
		
		System.out.print("대출하는 도서를 입력해주세요 : ");
		String loan = scan.nextLine();
		
		int book = 0;
		for(int i = 0; i< BookList.size();i++) {
//			System.out.println("'" + BookList.get(i) + "'");
			if(loan.equals(BookList.get(i))) {
				book = 1;
			}
		}
		
		if(book == 1) {
			System.out.println("'" + loan + "' 도서가 대출이 완료되었습니다.");
			System.out.println("대출 기간은 " + Borrow_time + " 일 입니다.");
			BookList.remove(loan);	
		}
		else {
			System.out.println("'" +loan + "' 도서가 없습니다.");
		}
		
		System.out.println("============================");
	}
	
	static void Bookadd(Borrow add) {
		
		System.out.print("반납 하는 도서를 입력해주세요 : ");
		String loan = scan.nextLine();
		
		System.out.println("'" + loan + "' 도서가 반납 되었습니다.");
		System.out.println("*****도서 목록*****");

		BookList.add(loan);	
		for(int i = 0; i< BookList.size();i++) {
			System.out.println("'" + BookList.get(i) + "'");
		}
		
		System.out.println("============================");
	}
	
	
	@Override 
	void printBook() {
		super.printBook();
		System.out.println("대출 하는 도서는 : " + super.getName() + " 입니다.");
		System.out.println("대출 기간은 " + Borrow_time + " 일 입니다.");
	}

	
}
