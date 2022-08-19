package ������.hr.presentation;

import java.util.List;

import ������.hr.domain.Worker;
import ������.hr.service.WorkerService;

public class WorkerIo {
	private WorkerService workerService;
	
	public WorkerIo(WorkerService workerService) {
		this.workerService = workerService;
	}
	
	public void choose() {
		int choose = 0;
		
		do { choose = Console.inNum("1. ���, 2. �߰�, 3. ����, 4. ����, 0. ����");
		switch(choose) {
		case 1: this.chack(); break;
		case 2: this.add(); break;
		case 3: this.update(); break;
		case 4: this.delete();
		}
		} while(choose !=0);
	}

	public void add() {
		Worker worker = new Worker();
		String name = "";
		String date = "";
		boolean isGood = false;
		
		do {
			name = Console.inStr("�̸��� �Է��ϼ��� /0��ư�� ���� ����ϱ�");
			if(name.charAt(0) == '0')
				this.choose();
			if(name.length() <= 5) {
				isGood = true;
			} else Console.info("5�� ���Ϸ� �Է��ϼ���");
		} while(!isGood);
		
		isGood = false;
		
		date = Console.inStr("�Ի����� yyyy-mm-dd�������� �Է��ϼ���");

		worker.setId(worker.lastnum++);
		worker.setName(name);
		worker.setDate(date);
			
		workerService.addWorker(worker);
	}
	
	public void chack() {
		List<Worker> workers = workerService.getWorkers();
		if(workers.size() == 0)
			Console.info("�뵿�ڰ� �����ϴ�");
		else if(workers != null) {
			for(Worker worker: workers)
				System.out.println(worker);
		}
	}
	
	public void update() {
		Worker worker = null;
		int reWorker = 0;
		String reName = "";
		String reDate = "";
		boolean isGood = false;
		
		reWorker = Console.inNum("������ ID�� �Է��ϼ��� /0������ �ڷΰ���");
		if(reWorker == 0)
			this.choose();
		else if (reWorker > workerService.getWorkers().size()) {
			Console.info("�뵿�ڰ� �����ϴ�");
			this.choose();
		}
		else worker = workerService.chooseWorker(reWorker);
		do {
			String ireName = Console.inStr("������ �̸��� �Է��ϼ���");
			if(ireName.length() <= 5) {
				isGood = true;
				reName = ireName;
			} else Console.info("5�� ���Ϸ� �Է��ϼ���");
		} while(!isGood);
		
		reDate = Console.inStr("������ �Ի��� yyyy-dd-mm �������� �Է��ϼ���");
		
		isGood = false;
		
		worker.setName(reName);
		worker.setDate(reDate);
		worker.setId(worker.getId());
		workerService.removeWorker(reWorker);
		workerService.addWorker(worker);
	}
	
	public void delete() {
		int delWorker = 0;
		Worker worker = null;
		delWorker = Console.inNum("������ ID�� �Է��ϼ���");
		if(delWorker == 0)
			this.choose();
		workerService.chooseWorker(delWorker);
		if(delWorker > workerService.getWorkers().size())
			Console.info("�뵿�ڰ� �����ϴ�");
		else {workerService.removeWorker(delWorker);
		}
	}
}
	
