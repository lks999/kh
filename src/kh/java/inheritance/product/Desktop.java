package kh.java.inheritance.product;

public class Desktop extends Computer {
	
	private String monitor;
	private String keyboard;
	private String mouse;
	
	public Desktop() {
		super();
	}
	public Desktop(String brand, String code, String name, int price,
			String os, String monitor, String keyboard, String mouse) {

		super(brand, code, name, price, os);
		
		this.monitor = monitor;
		this.keyboard = keyboard;
		this.mouse = mouse;
	}

	public String getMonitor() {
		return monitor;
	}
	public void setMonitor(String monitor) {
		this.monitor = monitor;
	}
	public String getKeyboard() {
		return keyboard;
	}
	public void setKeyboard(String keyboard) {
		this.keyboard = keyboard;
	}
	public String getMouse() {
		return mouse;
	}
	public void setMouse(String mouse) {
		this.mouse = mouse;
	}
	
	public String getDeskTopInfo() {
		return getComputerInfo() + ", " + monitor + ", " + keyboard + ", " + mouse;
	}
}
