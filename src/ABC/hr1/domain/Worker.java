package ABC.hr1.domain;

import java.time.LocalDate;

public class Worker {
	private int workerId;
	private String name;
	private LocalDate hireDate;
	
	public Worker(String name, int workerId, LocalDate hireDate) {
		this.name = name;
		this.workerId = workerId;
		this.hireDate = hireDate;
	}

	public int getWorkerId() {
		return workerId;
	}

	public String getName() {
		return name;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setWorkerId(int workerId) {
		this.workerId = workerId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	
	@Override
	public String toString() {
		return String.format("%-5s, %2d, %s", name, workerId, hireDate);
	}
}
