package Client;
//인터넷
public abstract class Internet extends Client{
	
	Internet(String name){
		super(name);
	}
	
	Internet(String name,int p){
		super(name);
	}
	
	abstract String Comments();
}
