package Client;

import java.util.Scanner;

// 댓글
public class Comments extends Internet{
	Scanner scan = new Scanner(System.in);
	public Comments(String name) {
		super(name);
	}

	void printcomments() {
		System.out.println("댓글을 입력해주세요 : ");
		String com = scan.next();
		
		
		
	}
	
	@Override
	String Comments() {
		// TODO Auto-generated method stub
		return null;
	}
}
