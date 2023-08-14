package Books;

import java.util.ArrayList;

import Client.Refund;
import Client.Review;

public class Main {

	public static void main(String[] args) {
		
//		Book book = new Book();
//		
//		Buy boo = new Buy(2022,5,13);
//		Sell bo2 = new Sell("나비");
//		Sell bo = new Sell(2800);
//		Sell bo1 = new Sell(2020,10,5);
//		book.start();
//		
		Refund re = new Refund("alswl", 5500);
		re.printRefund();
		
		Review rev = new Review("ss", 0);
		rev.printcomments();
				
		
//		boo.BookBuy();

//		bo.printBook();
		
//		Borrow borrow = new Borrow(); // 도서관 대출
//		borrow.Bookremove(borrow);
//		
//		Borrow add = new Borrow(); // 도서관 반납
//		add.Bookadd(add);
		
//		Borrow borrow2 = new Borrow(); // 대출
//		borrow2.printBook();
//		
//		Read read = new Read();
//		read.printBook();
	}

}
