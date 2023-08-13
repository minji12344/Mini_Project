package Client;
//고객
public class Client {
	private String name;
	
	Client(){
		name = "이름";
	}
	Client(String name){
		this.name = name;
	}
	
	void printClient() { 
		System.out.println("고객 성함 : " + name);
	}
	
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	
	
}
