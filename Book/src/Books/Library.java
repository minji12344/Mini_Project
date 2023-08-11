package Books;

public abstract class Library extends Book{
	
	Library(){
		
	}

	Library(String name){
		super(name);
	}

//	abstract int readAbook();
	
	@Override
	void printBook() {
		super.printBook();
		System.out.println("나왔다");
	}

	String getName() {
		return super.getName();
	}
	void setName(String name) {
		super.setName(name);
	}
}
