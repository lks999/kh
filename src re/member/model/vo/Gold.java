package member.model.vo;

public class Gold extends Member implements Buyable {
	
	public Gold() {
		
	}
	
	public Gold(String name, String grade, int point) {
		super(name, grade, point);
	}
	
	@Override
	public double getInterest() {
		return super.getPoint() *0.05;
	}

	@Override
	public int buy(int price) {
		return (int) (price - (price *0.05));
	}

}
