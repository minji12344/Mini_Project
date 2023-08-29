package Books;
// 도서관
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
	}

}
