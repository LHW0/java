package ch02.home.ex03;

import java.util.Scanner;

public class Unicode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자: ");
		char ch = sc.nextLine().charAt(0); // charAt char화 
		int unicode = ch;
		System.out.printf("%c의 unicode는 %d입니다.", ch , unicode);
		
		//char c = '' + s;
		//int i = c;
		
		//System.out.println(i);
	}
}

/*과제] 입력한 문자의 unicode 를 출력하라.
 * 
 * 문자 : A
 * A의 unicode는 65입니다.
 */
