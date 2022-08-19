package ch02.ex02;

public class C05SB {
	public static void main (String[] args) {
		StringBuffer src = new StringBuffer("우리 개는 ");
	
		int len = src.length();
		System.out.println("length: " + len);
		
		src.append("짓는다.");// string과 StringBuffer 비교
		src.replace(3, 4, "고양이");
		
		String str = src.toString();// stringbuffer를 string으로
		
		System.out.println(src);
		System.out.println(str);
	}
} 