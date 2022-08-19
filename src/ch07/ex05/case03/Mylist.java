package ch07.ex05.case03;

import java.util.ArrayList;

public class Mylist {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		
		System.out.println(list);
		
		for(int i: list) System.out.print(i + " ");
		System.out.println();
	
		System.out.println(list.get(0));
		
		System.out.println();
		
		for(int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");
		
		System.out.println();
		
		
		for(int i = 0; i < list.size(); i++)
			System.out.print(list.remove(i) + " ");
			
		System.out.println();
		
		int size = list.size();
		for(int i = 0; i < size; i++)
			list.remove(0);
		System.out.println(list);
			
		for(int i = list.size() - 1; i >=0; i--)
			list.remove(i);
			System.out.println(list);
		
	}

}
