package 이현우.hr.presentation;

import java.util.Scanner;

/**
 * @작성일 2022. 6. 29.
 */
public interface Console {
	Scanner sc = new Scanner(System.in);
	
	static void info(Object obj) {
		System.out.println(obj);
	}
	
	static String inStr(String msg) {
		System.out.print(msg + "\n> ");
		return sc.nextLine().trim();
	}
	
	static int inNum(String msg) {
		System.out.print(msg + "\n> ");
		int num = sc.nextInt(); sc.nextLine();
		return num;
	}
	
	public static void err(String msg) {
		System.out.println("ERROR] " + msg);
	}
}
