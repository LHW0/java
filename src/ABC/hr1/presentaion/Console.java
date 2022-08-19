package ABC.hr1.presentaion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

public interface Console {
	Scanner sc = new Scanner(System.in);
	
	static void info(Object obj) {
		System.out.println(obj);
	}
	
	static void err(String msg) {
		System.out.println("Error] : " + msg);
	}
	
	private static void in(String msg) {
		System.out.print(msg + "\n> ");
	}
	
	static String inStr(String msg, int len) {
		boolean isGood = false;
		String line = "";
		
		do {
			in(msg);
			line = sc.nextLine().trim();
			
			int length = line.length();
			isGood = 0 < length && length <= len;
			if(!isGood) err("1�� �̻�" + len + "�� ���ϸ� �Է��ϼ���");
		} while(!isGood);
		
		return line;
	}
	
	static int inNum(String msg) {
		boolean isGood = false;
		String line = "";
		int num = 0;
		
		do {
			in(msg);
			line = sc.nextLine().trim();
			
			if(line.length() > 0 && line.matches("[0-9]")) {
				num = Integer.parseInt(line);
				isGood = true;
			}
		
		if(!isGood) err("0 �̻��� �Է��ϼ���");
	} while(!isGood);
	
	return num;
	}
	
	static LocalDate inDate(String msg) {
		String line = "";
		LocalDate date = null;
		
		do {
			in(msg);
			line = sc.nextLine().trim();
			
			if(line.length() > 0) {
				try {
					date = LocalDate.parse(line, DateTimeFormatter.ISO_DATE);
				} catch(DateTimeParseException e) {}
			}
			
			if(date == null) err("���� ��¥�� yyyy-MM-dd �������� �Է��ϼ���");		
		} while(date == null);
		
		return date;
	}
	
	static String menu(List<String> menuItems) {
		String menu = "";
		int i = 0;
		
		for(String menuItem: menuItems)
			menu += ++i + ", " + menuItem + ", ";
		menu += "0. ����";
		
		return menu;
	}
}