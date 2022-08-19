package ������.hr.service;

import java.util.List;

import ������.hr.domain.Worker;

public interface WorkerService {
	public void addWorker(Worker worker);
	public void removeWorker(int worker);
	public Worker chooseWorker(int worker);
	List<Worker> getWorkers();
}
