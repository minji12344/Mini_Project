package Client;

import java.util.ArrayList;
import java.util.Scanner;
//장바구니
public class Basket extends Internet{
	Scanner scan = new Scanner(System.in);
	static ArrayList <String> Basket = new ArrayList<>();

	Basket(){
		
	}
	
	Basket(String name,int Score){
		super(name, Score);
	}
	
	void printBasket(Basket comm) {
		System.out.println("도서 제목 : ");
		String a = scan.next();
		
		Basket.add(a);
		System.out.println("*************장바구니*************");
		for(int i = 0; i< Basket.size();i++) {
			System.out.println("'" + Basket.get(i) + "'");
		}
	}
	
	@Override
	String Comments() {
		return null;
	}
}
