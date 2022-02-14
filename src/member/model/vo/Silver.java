package member.model.vo;

public class Silver extends Member {
	
	public Silver() {
		
	}
	
	public Silver(String name, String grade, int point) {
		super(name, grade, point);
	}
	
	public double getInterest() {
		return getPoint() *0.02;
	}

}
