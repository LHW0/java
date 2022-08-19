package ABC.hr1.service;

import java.time.LocalDate;
import java.util.List;

import ABC.hr1.dao.WorkerDao;
import ABC.hr1.domain.Worker;

public class WorkerServiceImpl implements WorkerService {
	private WorkerDao workerDao;
	
	public WorkerServiceImpl(WorkerDao workerDao) {
		this.workerDao = workerDao;
	}

	@Override
	public List<Worker> selectWorkers() {
		return workerDao.selectWorkers();
	}

	@Override
	public Worker selectWorker(int workerId) {
		return workerDao.selectWorker(workerId);
	}

	@Override
	public void insertWorker(String workerName, LocalDate hireDate) {
		workerDao.insertWorker(workerName, hireDate);
		
	}

	@Override
	public void updateWorker(Worker worker) {
		workerDao.updateWorker(worker);
		
	}

	@Override
	public void deleteWorker(int workerId) {
		workerDao.deleteWorker(workerId);
	}
}
