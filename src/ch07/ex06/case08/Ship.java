package ch07.ex06.case08;

import java.util.ArrayList;
import java.util.List;

public class Ship {
	private List<Container<?>> containers;
	
	public Ship() {
		containers = new ArrayList<>();
	}
	
	public void put(Container<?> container) {
		containers.add(container);
	}
}
