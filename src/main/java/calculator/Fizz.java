package calculator;

public class Fizz {
	private int number;
	private String name;
	public Fizz(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
}
