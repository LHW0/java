package ABC.hr1.service;

import java.time.LocalDate;
import java.util.List;

import ABC.hr1.domain.Worker;

public interface WorkerService {
	List<Worker> selectWorkers();
	Worker selectWorker(int workerId);
	void insertWorker(String workerName, LocalDate hireDate);
	void updateWorker(Worker worker);
	void deleteWorker(int workerId);
}
