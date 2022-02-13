package member.model.vo;

public class Silver {
	
	private String name;
	private String grade;
	private int point;
	
	public Silver() {
		
	}
	
	public Silver(String name, String grade, int point) {
		this.name = name;
		this.grade = grade;
		this.point = point;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public String getGrade() {
		return grade;
	}
	
	public void setPoint(int point) {
		this.point = point;
	}
	
	public int getPoint() {
		return point;
	}
	
	public double getInterest() {
		return point *0.02;
	}

}
