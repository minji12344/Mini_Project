package Client;
//고객
public class Client {
	private String name;
	private int Score;
//	private int num;
//	private final int Score1 = Score/num;
	
	Client(){
		name = "이름";
	}
	Client(String name, int Score){
		this.name = name;
		this.Score = Score;
	}
	
//	Client(int Score1){
//		this.Score1 = Score1;
//	}
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
