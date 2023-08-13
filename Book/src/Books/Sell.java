package Books;
// 파는 사람
public class Sell extends Economy{
	
	Sell(){
		
	}
	
	Sell(String name){
		super(name);
	}
	
	Sell(int price){
		super(price);
	}
	
	Sell(int year, int month, int day){
		super(year, month, day);
	}
	
	@Override
	void printBook() {
		super.printBook();
		System.out.println("'" + super.getName()+"' 도서를 " + (int)(super.getPrice()/1.25) + "원에 판매하였습니다.");
		System.out.println("======================================");

	}
}
