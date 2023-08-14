package Books;

public class Read extends Library{
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
	
	@Override
	void printBook() {
		super.printBook();
		System.out.println("'" + super.getName()+ "' 도서를 " + read_time + "시간 읽었습니다.");
	}
}
