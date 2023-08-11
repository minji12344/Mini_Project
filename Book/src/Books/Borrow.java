package Books;

import java.util.Scanner;

public class Borrow extends Library{
	static final int Borrow_time = (int)(Math.random()*6+1);
	
	Borrow(){
		
	}
	
	Borrow(String name){
		super(name);
	}
	Borrow(String name, int Borrow_time){
		super(name);
	}
	
	
	void Booklist() {
		super.Booklist();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("대출 하는 도서를 입력해주세요 : ");
		String loan = scan.next();
		
		
//		BookList.remove(loan);
		
		
	}
	
	@Override
	void printBook() {
		super.printBook();
		System.out.println("대출 하는 도서는 : " + super.getName() + " 입니다.");
		System.out.println("대출 기간은 " + Borrow_time + " 일 입니다.");
	}
}
