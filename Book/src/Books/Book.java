package Books;

import java.util.Scanner;

public class Book {
	static private String name;
	
	Book(){
		String name = "책";
	}
	
	Book(String name){
		this.name = name;
	}
	
	void printBook() {
		System.out.println("도서 제목 :" + name);
	}
	
	void start() {
		Scanner scan = new Scanner(System.in);
		System.out.println("1.도서관에 갑니다 2.서점에 갑니다.");
		int num =scan.nextInt();
		
		if(num == 1) {
			System.out.println("1.대출 2.반납 3.보고간다");
			int num2 = scan.nextInt();
			if(num == 1) {
//				Library.Booklist();				
			}else if(num == 2){
				
			}else if(num == 3){
//				Read.printBook();
			}
		}
		System.out.println("");
	}
	
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
}


