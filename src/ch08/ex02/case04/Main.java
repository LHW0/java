package ch08.ex02.case04;

public class Main {
	public static void main(String[] args) {
		int choice = 1;
		String jobName = "";
		
		switch(Job.toJob(choice)) {
		case EXIT: jobName = "����"; break;
		case LIST: jobName = "���"; break;
		case ADD: jobName = "�߰�"; break;
		case FIX: jobName = "����"; break;
		case DEL: jobName = "����"; break;
		}
		
		choice = 7;
		Job job = null;
		switch((job = Job.tojob2(choice)) != null ? job : job.EXIT) {
		case EXIT: jobName = "����"; break;
		case LIST: jobName = "���"; break;
		case ADD: jobName = "�߰�"; break;
		case FIX: jobName = "����"; break;
		case DEL: jobName = "����"; break;
	}
		System.out.println(jobName);
	}
}
