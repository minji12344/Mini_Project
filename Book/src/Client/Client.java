package Client;

import java.util.Scanner;

//고객
public class Client {
	private static String name; // 고객성함
	private int Score; // 평점
//	private int num;
//	private final int Score1 = Score/num;
	
	public Client(){
		name = "성함";
	}
	Client(String name, int Score){
		this.name = name;
		this.Score = Score;
	}
	
//	Client(int Score1){
//		this.Score1 = Score1;
//	}
	
	public void start() {
		Refund re = new Refund();
		Exchange ex = new Exchange();
		Review revi = new Review();
		Basket bask = new Basket();
		
		while(true) {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("1.전화문의 2.인터넷문의 3.종료");
			int a = scan.nextInt();
			
			if(a==1) {
				System.out.println("1.환불 2. 교환");
				int b = scan.nextInt();
				
				if(b==1) {
					re.printClient();
				}
				else if(b==2) {
					ex.printClient(ex);
				}
				else {
					System.out.println("잘못입력하였습니다.");
				}
			}
			else if(a==2) {
				System.out.println("1.장바구니 2. 댓글");
				int c = scan.nextInt();
				
				if(c == 1) {
					bask.printBasket(bask);
				}else if(c == 2) {
					revi.printcomments(revi);
				}
				
			}else {
				System.out.println("종료합니다.");
				break;
			}
		}
	}
	void printClient() { 
		System.out.println("고객 성함 : " + name);
	}
	
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	
	int getScore() {
		return Score;
	}
	
}
