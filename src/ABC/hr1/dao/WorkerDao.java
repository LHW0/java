package ABC.hr1.dao;

import java.time.LocalDate;
import java.util.List;

import ABC.hr1.domain.Worker;

public interface WorkerDao {
	List<Worker> selectWorkers();
	Worker selectWorker(int workerId);
	void insertWorker(String workerName, LocalDate hireDate);
	void updateWorker(Worker worker);
	void deleteWorker(int workerId);
}
