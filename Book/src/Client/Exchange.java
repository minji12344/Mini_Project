package Client;
//교환
public class Exchange extends Call{

	Exchange(){
		
	}
	
	Exchange(String name,int Score){
		super(name,Score);
	}
	
	
	
	
	@Override
	String Call() {
		System.out.println("고객 성함 : " + super.getName());
		System.out.println("'" + super.getName() + "' 도서가 교환이 되었습니다.");
		return "name";
	}
	

	void printClient(Client client) {
		super.printClient();
		System.out.println("'" + super.getName() + "' 도서가 교환이 되었습니다.");
	}
}
