package ������.hr;

import java.util.ArrayList;
import java.util.List;

import ������.hr.dao.WorkerDao;
import ������.hr.dao.WorkerDaoImpl;
import ������.hr.domain.Worker;
import ������.hr.presentation.WorkerIo;
import ������.hr.service.WorkerService;
import ������.hr.service.WorkerServiceImpl;

public class Main {
	public static void main(String[] args) {
		List<Worker> workers = new ArrayList<>();
		
		WorkerDao workerDao = new WorkerDaoImpl(workers);
		WorkerService workerService = new WorkerServiceImpl(workerDao);
		WorkerIo workerIo = new WorkerIo(workerService);
		
		workerIo.choose();
	}
}
