package Client;
//교환
public class Exchange extends Call{

	Exchange(String name){
		super(name);
	}
	
	void Exchange() {
		System.out.println("'" + super.getName() + "' 도서가 교환이 되었습니다.");
	}
	
	@Override
	String Refund() {
		System.out.println("고객 성함 : " + super.getName());
		return "name";
	}
}
