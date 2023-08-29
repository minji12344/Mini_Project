package Client;
//전화문의 = 환불
public class Refund extends Call{
	static int Price = 5000 + (int)(Math.random()*2000+1);
	double refund = (Price*0.95);
	
	Refund() {
	
	}
	
	public Refund(double refund) {
		this.refund = refund;
	}
	
	Refund(String name,int Score) {
		super(name,Score);
	}
	
	Refund(String name, int Score, int Price) {
		super(name,Score);
		this.Price = Price;
	}

	
	void printClient() {
		super.printClient();
		System.out.println((int)refund + "원 환불이 되었습니다.");	
	}
	
	@Override
	String Call() {
		System.out.println("고객 성함 : " + this.getName());
		System.out.println((int)refund + "원 환불이 되었습니다.");
		return "name";
	}

}
