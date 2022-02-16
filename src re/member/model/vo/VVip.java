package member.model.vo;

public class VVip extends Member implements Buyable {
	
	public VVip() {
		
	}
	
	public VVip(String name, String grade, int point) {
		super(name, grade, point);
	}
	
	@Override
	public double getInterest() {
		return super.getPoint() *0.15;
	}

	@Override
	public int buy(int price) {
		return (int) (price - (price *0.15));
	}

}
