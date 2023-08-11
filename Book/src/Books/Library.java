package Books;

public abstract class Library extends Book{
	
	Library(){
		
	}
	
	Library(String name){
		super(name);
	}

	void list() {
		System.out.println("*****도서 목록*****");
		System.out.println("'도서관에 간 사자'");
		System.out.println("'실수쟁이 꼬마 돼지의 하루 (그림책)'");
		System.out.println("'밤의 도서관'");
		System.out.println("'사서e마을 이야기'");
	}
	
	@Override
	void printBook() {
		super.printBook();
		System.out.println("나왔다");
	}

}
