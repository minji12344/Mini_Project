package Client;
//전화
public abstract class Call extends Client {
	
	Call(){
		
	}
	
	Call(String name,int Score){
		super(name,Score);
	}
	
	abstract String Call();
	
	@Override
	void printClient() {
		super.printClient();
	}

	String printRefund() {
		super.printClient();
		return "name";
	}
}
