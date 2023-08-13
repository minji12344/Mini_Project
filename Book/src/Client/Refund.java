package Client;
//환불
public class Refund extends Call{
	static int Price;
	static final double refund = (Price/1.05);
	
//	public Refund(int Price) {
//		this.Price = Price;
//	}
	
	public Refund(String name) {
		super(name);
	}
	
	public Refund(String name, int Price) {
		super(name);
		this.Price = Price;
	}

	public void printRefund() {
		System.out.println((int)refund + "원 환불이 되었습니다.");
	}
	
	@Override
	String Refund() {
		System.out.println("고객 성함 : " + super.getName());
		return "name";
	}

}
