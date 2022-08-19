package 이현우.hr.presentation;

import java.util.List;

import 이현우.hr.domain.Worker;
import 이현우.hr.service.WorkerService;

public class WorkerIo {
	private WorkerService workerService;
	
	public WorkerIo(WorkerService workerService) {
		this.workerService = workerService;
	}
	
	public void choose() {
		int choose = 0;
		
		do { choose = Console.inNum("1. 목록, 2. 추가, 3. 수정, 4. 삭제, 0. 종료");
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
			name = Console.inStr("이름을 입력하세요 /0버튼을 눌러 취소하기");
			if(name.charAt(0) == '0')
				this.choose();
			if(name.length() <= 5) {
				isGood = true;
			} else Console.info("5자 이하로 입력하세요");
		} while(!isGood);
		
		isGood = false;
		
		date = Console.inStr("입사일을 yyyy-mm-dd형식으로 입력하세요");

		worker.setId(worker.lastnum++);
		worker.setName(name);
		worker.setDate(date);
			
		workerService.addWorker(worker);
	}
	
	public void chack() {
		List<Worker> workers = workerService.getWorkers();
		if(workers.size() == 0)
			Console.info("노동자가 없습니다");
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
		
		reWorker = Console.inNum("변경할 ID를 입력하세요 /0을눌러 뒤로가기");
		if(reWorker == 0)
			this.choose();
		else if (reWorker > workerService.getWorkers().size()) {
			Console.info("노동자가 없습니다");
			this.choose();
		}
		else worker = workerService.chooseWorker(reWorker);
		do {
			String ireName = Console.inStr("변경할 이름을 입력하세요");
			if(ireName.length() <= 5) {
				isGood = true;
				reName = ireName;
			} else Console.info("5자 이하로 입력하세요");
		} while(!isGood);
		
		reDate = Console.inStr("변경할 입사일 yyyy-dd-mm 형식으로 입력하세요");
		
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
		delWorker = Console.inNum("삭제할 ID를 입력하세요");
		if(delWorker == 0)
			this.choose();
		workerService.chooseWorker(delWorker);
		if(delWorker > workerService.getWorkers().size())
			Console.info("노동자가 없습니다");
		else {workerService.removeWorker(delWorker);
		}
	}
}
	
