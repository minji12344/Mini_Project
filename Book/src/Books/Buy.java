package Books;

import java.util.ArrayList;

//서점 - 사는 사람
public class Buy extends Economy{

	
	public Buy(){
		super();
	}
	
	public Buy(String name){
		super();
	}
	
	public Buy(String name,int price){
		super();
	}
	
	public Buy(int price){
		super(price);
	}
	
	public Buy(int year, int month, int day){
		super(year, month, day);
	}
	
	
	void BookBuy() {
		System.out.println("*****도서 목록*****");
		for(int i = 0; i< BookList.size();i++) {
			System.out.println("'" + BookList.get(i) + "'");
		}

		System.out.print("♥ 구입하는 도서를 입력해주세요 : ");
		String loan = scan.nextLine();
		
		int book = 0;
		for(int i = 0; i< BookList.size();i++) {
			if(loan.equals(BookList.get(i))) {
				book = 1;
			}
		}
		if(book == 1) {
			BookList.remove(loan);	
			super.printBook();
			System.out.println("* '" + loan + "' 도서를 " + this.getPrice() + "원에 구입하였습니다.");
			BookList.remove(loan);	
		}
		else {
			System.out.println("*'" +loan + "' 도서가 없습니다.");
		}
		
		System.out.println("============================");
		
	}
	
	@Override
	void  printBook() {
		super.printBook();
		System.out.println("'" + super.getName() + "' 도서를 구입하였습니다.");
	}
}
