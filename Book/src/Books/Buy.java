package Books;

import java.util.ArrayList;

//서점 - 사는 사람
public class Buy extends Economy{
	private ArrayList <String> BookList = new ArrayList<>();

	public Buy(){
		super();

	BookList.add("아메리칸 프로메테우스(특별판)");
	BookList.add("세이노의 가르침");
	BookList.add("문과 남자의 과학공부");
	BookList.add("메리골드 마음 세탁소");
	}
//	public Buy(){
//		super();
//	}
	
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
		for(int i = 0; i< this.BookList.size();i++) {
			System.out.println("'" + this.BookList.get(i) + "'");
		}

		System.out.print("♥ 구입하는 도서를 입력해주세요 : ");
		String loan = scan.nextLine();
		
		int book = 0;
		for(int i = 0; i< this.BookList.size();i++) {
			if(loan.equals(this.BookList.get(i))) {
				book = 1;
			}
		}
		if(book == 1) {
			this.BookList.remove(loan);	
			super.printBook();
			System.out.println("* '" + loan + "' 도서를 " + this.getPrice() + "원에 구입하였습니다.");
			this.BookList.remove(loan);	
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
