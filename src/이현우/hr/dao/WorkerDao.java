package ������.hr.dao;

import java.util.List;

import ������.hr.domain.Worker;

public interface WorkerDao {
	public void insertWorker(Worker worker);
	public void outWorker(int worker);
	Worker chooseWorker(int worker);
	List<Worker> selectWorker();
}
