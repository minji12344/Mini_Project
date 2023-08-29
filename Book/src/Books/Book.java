package Books;
// 도서관, 서점 (부모)
import java.util.Scanner;

public class Book {
	private String name;
//	Borrow remove = new Borrow();

	public Book(){
		
	}
	
	public Book(String name){
		this.name = name;
	}
	
	void printBook() {
		System.out.println("도서 제목 :" + name);
	}
	
//	void printBook(String string) {
//		System.out.println("도서 제목 :" + name);
//	}
	
	public void start() {
		Borrow remove = new Borrow();
		Read read = new Read();
		Sell sell = new Sell();
		Buy buy = new Buy();

		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("1.도서관에 갑니다 2.서점에 갑니다. 3.집에 갑니다.");
			int num =scan.nextInt();
			
			if(num == 1) {
				System.out.println("1.대출 2.반납 3.독서");
				int num2 = scan.nextInt();
				if(num2 == 1) {
					remove.Bookremove();
				}else if(num2 == 2){
					remove.Bookadd();
				}else if(num2 == 3){
					read.printBook();
				}
			}
			else if(num == 2) {
				System.out.println("1.구입 2.판매");
				int num2 = scan.nextInt();
				if(num2 == 1) {
					buy.BookBuy();
				}else if(num2 == 2) {
					sell.printBook();
					
				}else {
					System.out.println("잘못입력하였습니다.");
				}
				
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


