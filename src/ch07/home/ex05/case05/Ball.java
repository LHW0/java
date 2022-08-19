package ch07.home.ex05.case05;

public class Ball {
	private int num;
	
	public Ball(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return this.num;
	}
	
	@Override
	public String toString() {
		return this.num + " ";
	}
	
}
