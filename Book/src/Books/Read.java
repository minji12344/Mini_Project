package Books;

public class Read extends Library{
	static int read_time;

	Read(String name){
		super(name);
	}
	
	Read(String name ,int read_time){
		super(name);
		this.read_time = read_time;
	}
	
	@Override
	void printBook() {
		super.printBook();
		System.out.println(super.getName() + "을 봅니다.");
	}
}
