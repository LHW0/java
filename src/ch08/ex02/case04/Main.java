package ch08.ex02.case04;

public class Main {
	public static void main(String[] args) {
		int choice = 1;
		String jobName = "";
		
		switch(Job.toJob(choice)) {
		case EXIT: jobName = "종료"; break;
		case LIST: jobName = "목록"; break;
		case ADD: jobName = "추가"; break;
		case FIX: jobName = "수정"; break;
		case DEL: jobName = "삭제"; break;
		}
		
		choice = 7;
		Job job = null;
		switch((job = Job.tojob2(choice)) != null ? job : job.EXIT) {
		case EXIT: jobName = "종료"; break;
		case LIST: jobName = "목록"; break;
		case ADD: jobName = "추가"; break;
		case FIX: jobName = "수정"; break;
		case DEL: jobName = "삭제"; break;
	}
		System.out.println(jobName);
	}
}
