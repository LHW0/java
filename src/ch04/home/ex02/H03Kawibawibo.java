package ch04.home.ex02;

import java.util.Scanner;

public class H03Kawibawibo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int playerchoice = 0;
		int appchoice = 0;
		String result = "";
		String choice = "";
		
		System.out.println("1.����, 2.���� ,3. ��\n ");
		playerchoice = sc.nextInt();
		appchoice = (int)(Math.random() * 3) +1;
		
		if(1 <= playerchoice && playerchoice <= 3) {
			switch (playerchoice - appchoice) {
			case -2: case 1:
				result = "You win"; break;
			case -1: case 2:
				result = "You lose"; break;
			case 0:
				result = "Fair";
			}
			switch(playerchoice) {
			case 1: choice = "����"; break;
			case 2: choice = "����"; break;
			case 3: choice = "��";
			}
			System.out.println("You: " + choice);
			
			switch(appchoice) {
			case 1: choice = "����"; break;
			case 2: choice = "����"; break;
			case 3: choice = "��";
			}
			System.out.println("Me: " + choice);
		} else {
			result = "ERROR] 1,2,3, ���� �ϳ��� �Է��ϼ���.";
		}
	
		System.out.println(result);
		
	}

}
/* ����>
 �۰� ������������ �Ѵ�
 ���Ӱ���� �˷��ش�
 �����
 you win
 you lose
 Fair
 ���� �ϳ��̴�

1. ����, 2. ����, 3. ��
>1
You: ����
Me:

You win
*/