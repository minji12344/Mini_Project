package Books;

import java.util.Scanner;

public class Book {
	static private String name;
	
	Book(){
		name = "책";
	}
	
	Book(String name){
		this.name = name;
	}
	
	void printBook() {
		System.out.println("도서 제목 :" + name);
	}
	
//	void printBook(String string) {
//		System.out.println("도서 제목 :" + name);
//	}
	
	void start(String string) {
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("1.도서관에 갑니다 2.서점에 갑니다. 3. 집에 갑니다.");
			int num =scan.nextInt();
			
			if(num == 1) {
				System.out.println("1.대출 2.반납 3.독서");
				int num2 = scan.nextInt();
				if(num2 == 1) {
					Borrow remove = new Borrow();
					remove.Bookremove(remove);
				}else if(num2 == 2){
					Borrow add = new Borrow();
					add.Bookadd(add);
				}else if(num2 == 3){
					Read read1 = new Read();
					read1.printBook(read1);
				}
			}
			else if(num == 2) {
				System.out.println("서점");	
			}
			else if(num == 3) {
				System.out.println("종료");
				break;
			}
			else {
				System.out.println("잘못입력하였습니다.");
			}
		}
	}
	
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
}


