package member.model.vo;

public class Ruby extends Member implements Buyable {

	public Ruby() {
		
	}
	
	public Ruby(String name, String grade, int point) {
		super(name, grade, point);
	}
	
	@Override
	public double getInterest() {
		return super.getPoint() *0.3;
	}

	@Override
	public int buy(int price) {
		return (int) (price - (price *0.3));
	}
	
	

}
