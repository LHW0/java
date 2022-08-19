package ch07.ex01.case07;
// 과제] 인간이 라면 외에, 김치와 사과를 먹도록 디자인하라.
public class Human {
//	public void eat(Ramen ramen) {}
//	public void eat(Kimchi kimchi) {}
//	public void eat(Apple apple) {}
	
	public void eat(Food food) {
		System.out.println(food + "를 먹다.");
	}
}
