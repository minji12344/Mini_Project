package Client;
//전화
public abstract class Call extends Client {
	
	Call(String name,int Score){
		super(name,Score);
	}
	
	abstract String Refund();
	
	void printClient() {
		System.out.println("고객 성함 : ");
	}
}
