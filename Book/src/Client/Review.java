package Client;

import java.util.ArrayList;
import java.util.Scanner;
// 댓글
public class Review extends Internet{
	static ArrayList <String> view = new ArrayList<>();
	static Scanner scan = new Scanner(System.in);
	
	Review(){
		view.add("쉽고 재미있음은 물론 알찬 지식까지 얻을 수 있다.");
		view.add("위로가 되는 시간이였어요");
		view.add("읽는 마음이 내내 흐뭇했다.");
		
	}
	
	Review(String name,int Score) {
		super(name,Score);
	}

	void printcomments(Review comm) {
		System.out.println("댓글을 입력해주세요 : ");
		String review = scan.next();
		
		view.add(review);
		System.out.println("***************도서 리뷰*************");
		for(int i = 0; i< view.size();i++) {
			System.out.println("'" + view.get(i) + "'");
		}
	}
	
	@Override
	String Comments() {
		System.out.println("평점 : " + super.getScore());
		return null;
	}
}
