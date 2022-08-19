package ch07.ex04.case04;

public class Slot {
	private Ball[] balls;
	
	public Slot() {
		balls = new Ball[10];
		
		for(int i = 0; i < balls.length; i++) {
			balls[i] = new Ball(i + 1);
		}
	}
	
	public Ball chuck() {
		int i = 0;
		Ball ball = null;

		do {
			i = (int)(Math.random() * 10);
			ball = balls[i];
			balls[i] = null;
		} while (ball == balls[i]); 
		
		return ball;
	}

}
