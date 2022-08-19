package 이현우.hr.dao;

import java.util.List;

import 이현우.hr.domain.Worker;

public class WorkerDaoImpl implements WorkerDao {
	private List<Worker> workers;
	
	public WorkerDaoImpl(List<Worker> workers) {
		this.workers = workers;
	}
	
	@Override
	public void insertWorker(Worker worker) {
		workers.add(worker);
	}
	
	@Override
	public void outWorker(int worker) {
		for(int i = 0; i < workers.size(); i++) {
			if(workers.get(i).getId() == worker)
			workers.remove(i);
		}
	}
	
	@Override
	public List<Worker> selectWorker() {
		return workers;
	}
	
	@Override
	public Worker chooseWorker(int workernum) {
		Worker worker = null;
		for(Worker iworker: workers) {
			if(iworker.getId() == workernum)
				worker = iworker;
		}
		return worker;
	}
}
