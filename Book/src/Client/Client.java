package Client;
//고객
public class Client {
	private String name;
	private int Score;
	
	Client(){
		name = "이름";
	}
	Client(String name, int Score){
		this.name = name;
		this.Score = Score;
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
	
	int getScore() {
		return Score;
	}
}
