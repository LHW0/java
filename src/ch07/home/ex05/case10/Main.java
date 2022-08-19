package ch07.home.ex05.case10;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Pen pen = new Pen();
		Eraser eraser = new Eraser();
		//Bag<Supplies> bag = new Bag(); Bag 객체를 만들었을때
		List<Supplies> bags = new ArrayList<>();
		
		bags.add(pen);
		bags.add(eraser);
		
		for(Supplies supplies: bags) {
				if(supplies instanceof Pen) ((Pen)supplies).write();
				if(supplies instanceof Eraser) ((Eraser)supplies).erase();
		}
	}
}

/*
가방에 연필과 지우개를 담는다
가방에서 물건을 꺼낸다
꺼낸 물건이 연필이면 write, 지우개면 지운다
*/