package ÀÌÇö¿ì.hr.domain;

public class Worker {
	private String name;
	private String date;
	private int id;
	public static int lastnum = 1;
	
	public Worker() {}
	
	public Worker(String name, int id, String date) {
		this.name = name;
		this.id = id;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public String getDate() {
		return date;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return String.format("%5s %5s %5s", name, id, date);
	}

}