package Books;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Library extends Book{
	
	Library(){
		
	}
	
	Library(String name){
		super(name);
	}

	void list() {
		System.out.println("'도서관에 간 사자'");
		System.out.println("'실수쟁이 꼬마 돼지의 하루 (그림책)'");
		System.out.println("'밤의 도서관'");
		System.out.println("'사서e마을 이야기'");
	}
	void Booklist() {
		ArrayList <String> BookList = new ArrayList<>();
		
		for(int i =0; i<3; i++) {
			Scanner scan = new Scanner(System.in);
			System.out.print("도서 이름을 입력해주세요 : ");
			String name= scan.next();
			BookList.add(name);	
		}
		System.out.println("***도서 목록***");
		this.list();
		for(int i = 0; i< BookList.size();i++) {
			System.out.println("'" + BookList.get(i) + "'");
		}
		
		
	}
	
	@Override
	void printBook() {
		super.printBook();
		System.out.println("나왔다");
	}

}
