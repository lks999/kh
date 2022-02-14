package member.model.vo;

public class VVip extends Member {
	
	public VVip() {
		
	}
	
	public VVip(String name, String grade, int point) {
		super(name, grade, point);
	}
		
	public double getInterest() {
		return getPoint() *0.15;
	}

}
