package Books;

import java.util.Scanner;

// 도서관 - 3 독서
public class Read extends Library{
	Scanner scan = new Scanner(System.in);
	int read_time = (int)(Math.random()*8+1);

	Read(){
		
	}
	
	public Read(String name){
		super(name);
	}
	
	Read(String name ,int read_time){
		super(name);
	}
	
	void printBook(Read read) {
		super.printBook();
		System.out.println("'" + read.getName()+ "' 도서를 " + read_time + "시간 읽었습니다.");
	}
	
	void printBook() {
		System.out.print("읽으실 도서 제목 :");
		String booktitle = scan.nextLine();
		System.out.println("'" + booktitle + "' 도서를 " + read_time + "시간 읽었습니다.");
	}
}
