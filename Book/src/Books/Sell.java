package Books;

import java.util.Scanner;

// 파는 사람
public class Sell extends Economy{
	Scanner scan = new Scanner(System.in);
	public Sell(){
	}
	
	public Sell(String name){
		super(name);
	}
	
	public Sell(int price){
		super(price);
	}
	
	public Sell(int year, int month, int day){
		super(year, month, day);
	}
	
	void printBook() {
		System.out.print("♥ 판매 할 도서명 : ");
		String a = scan.nextLine();
		System.out.print("♥ 도서의 원가 : ");
		int b = scan.nextInt();
		super.printBook();
		System.out.println("*'" + a +"' 도서를 " + (int)b*0.8 + "원에 판매하였습니다.");
		System.out.println("======================================");

	}
}
