package 이현우.hr.dao;

import java.util.List;

import 이현우.hr.domain.Worker;

public interface WorkerDao {
	public void insertWorker(Worker worker);
	public void outWorker(int worker);
	Worker chooseWorker(int worker);
	List<Worker> selectWorker();
}
