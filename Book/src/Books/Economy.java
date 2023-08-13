package Books;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Economy extends Book {
	static ArrayList <String> BookList = new ArrayList<>();
	static Scanner scan = new Scanner(System.in);

	static private int Price;
	static private int year;
	static private int month;
	static private int day;
	
	Economy(){
		BookList.add("아메리칸 프로메테우스(특별판)");
		BookList.add("세이노의 가르침");
		BookList.add("문과 남자의 과학공부");
		BookList.add("메리골드 마음 세탁소");
	}
	
	Economy(String name){
		super(name);
	}
	
	Economy(int Price){
		this.Price = Price;
	}
	
	Economy(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	void Economylist(){
		BookList.add("아메리칸 프로메테우스(특별판)");
		BookList.add("세이노의 가르침");
		BookList.add("문과 남자의 과학공부");
		BookList.add("메리골드 마음 세탁소");
	}
	
	@Override
	void printBook() {
		super.printBook();
		System.out.println("도서 가격은 " + this.Price + " 입니다.");
		System.out.println("도서의 발행일은 " + year + "년 " + month+ "월 " + day+ "일 입니다.");

	}
	
	int getPrice() {
		return Price;
	}

	void printBook(Book book) {
		// TODO Auto-generated method stub
		
	}

}
