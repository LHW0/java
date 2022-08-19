package ABC.hr1.dao;

import java.time.LocalDate;
import java.util.List;

import ABC.hr1.domain.Worker;

public class WorkerDaoImpl implements WorkerDao {
	private List<Worker> workers;
	private int workerIdSeq;
	
	public WorkerDaoImpl(List<Worker> workers) {
		this.workers = workers;
		this.workerIdSeq = 1;
	}
	
	@Override
	public List<Worker> selectWorkers() {
		return workers;
	}

	@Override
	public Worker selectWorker(int workerId) {
		Worker worker = null;
		
		for(Worker workerTmp: workers) {
			if(workerTmp.getWorkerId() == workerId) {
				worker = workerTmp;
				break;
			}
		}
		return worker;
	}

	@Override
	public void insertWorker(String workerName, LocalDate hireDate) {
		workers.add(new Worker(workerName, workerIdSeq++, hireDate));
	}

	@Override
	public void updateWorker(Worker workerTmp) {
		workers.forEach(worker -> {
			if(worker.getWorkerId() == workerTmp.getWorkerId()) {
				worker.setName(workerTmp.getName());
				worker.setHireDate(workerTmp.getHireDate());
			}
		});
		
	}

	@Override
	public void deleteWorker(int workerId) {
		Worker worker = null;
		worker = selectWorker(workerId);
		if(worker != null) workers.remove(worker);
		
	}
}
