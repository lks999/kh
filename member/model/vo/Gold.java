package member.model.vo;

public class Gold {
	private String name;
	private String grade;
	private int point;
	
	public Gold() {
		
	}
	
	public Gold(String name, String grade, int point) {
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
		return point *0.05;
	}

}
