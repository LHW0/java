package ch07.home.ex05.case10;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Pen pen = new Pen();
		Eraser eraser = new Eraser();
		//Bag<Supplies> bag = new Bag(); Bag ��ü�� ���������
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
���濡 ���ʰ� ���찳�� ��´�
���濡�� ������ ������
���� ������ �����̸� write, ���찳�� �����
*/