package kh.java.inheritance.product;

public class SmartPhone extends Computer {

	private String carrier; // 통신사
	
	public SmartPhone() {
		super();
	}

	public SmartPhone(String brand, String code, String name, int price, String os, String carrier) {
		super(brand, code, name, price, os);
		this.carrier = carrier;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	
	public String getSmartPhoneInfo() {
		return getComputerInfo()  +  ", " + carrier;
	}
}
