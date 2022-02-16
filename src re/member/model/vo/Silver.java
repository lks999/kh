package member.model.vo;

public class Silver extends Member implements Buyable {
	
	public Silver() {
		
	}
	
	public Silver(String name, String grade, int point) {
		super(name, grade, point);
	}
	
	public double getInterest() {
		return super.getPoint() *0.02;
	}

	@Override
	public int buy(int price) {
		return (int) (price - (price *0.02));
	}

}
