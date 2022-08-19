package 이현우.hr;

import java.util.ArrayList;
import java.util.List;

import 이현우.hr.dao.WorkerDao;
import 이현우.hr.dao.WorkerDaoImpl;
import 이현우.hr.domain.Worker;
import 이현우.hr.presentation.WorkerIo;
import 이현우.hr.service.WorkerService;
import 이현우.hr.service.WorkerServiceImpl;

public class Main {
	public static void main(String[] args) {
		List<Worker> workers = new ArrayList<>();
		
		WorkerDao workerDao = new WorkerDaoImpl(workers);
		WorkerService workerService = new WorkerServiceImpl(workerDao);
		WorkerIo workerIo = new WorkerIo(workerService);
		
		workerIo.choose();
	}
}
