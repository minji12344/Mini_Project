package Client;
//인터넷문의
public abstract class Internet extends Client{
		
	Internet(){
		
	}
	
	Internet(String name,int Score){
		super(name,Score);
	}
	
	abstract String Comments();
}
