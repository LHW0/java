package ������.hr.service;

import java.util.List;

import ������.hr.dao.WorkerDao;
import ������.hr.domain.Worker;

public class WorkerServiceImpl implements WorkerService {
	private WorkerDao workerDao;
	
	public WorkerServiceImpl(WorkerDao workerDao) {
		this.workerDao = workerDao;
	}
	
	@Override
	public List<Worker> getWorkers() {
		List<Worker> workers = workerDao.selectWorker();
		return workers;	
	}

	@Override
	public void addWorker(Worker worker) {
		workerDao.insertWorker(worker);
	}
	
	@Override
	public void removeWorker(int worker) {
		workerDao.outWorker(worker);
	}

	@Override
	public Worker chooseWorker(int worker) {
		return workerDao.chooseWorker(worker);
	}
}
