package Books;

public abstract class Economy extends Book {
	static private int Price;
	static private int year;
	static private int month;
	static private int day;
	
	Economy(String name){
		super(name);
	}
	
	Economy(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	void list() {
		System.out.println("아메리칸 프로메테우스(특별판)");
		System.out.println("세이노의 가르침");
		System.out.println("문과 남자의 과학공부");
		System.out.println("메리골드 마음 세탁소");
	}
	
	@Override
	void printBook() {
		super.printBook();
		System.out.println("나왔다");
	}
}
