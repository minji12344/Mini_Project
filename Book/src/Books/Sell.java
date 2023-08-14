package Books;
// 파는 사람
public class Sell extends Economy{
	
	
	public Sell(String name){
		super(name);
	}
	
	public Sell(int price){
		super(price);
	}
	
	public Sell(int year, int month, int day){
		super(year, month, day);
	}
	
	@Override
	void printBook() {
		super.printBook();
		System.out.println("'" + super.getName()+"' 도서를 " + (int)(super.getPrice()*0.80) + "원에 판매하였습니다.");
		System.out.println("======================================");

	}
}
