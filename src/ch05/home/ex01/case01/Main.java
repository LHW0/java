package ch05.home.ex01.case01;

public class Main {
	public static void main(String[] args) {
		Flower flower = new Flower();
		Flower flower2 = new Flower();
	
		 flower.name = "창포꽃";
		 flower.petal = 7;
		 flower.calyx = 2;
		 
		 flower.name = "코스모스";
		 flower2.petal = 4;
		 flower2.calyx = 1;
	}
	

}
/*창포꽃은 꽃잎 길이가 7cm, 꽃받침 길이가 2cm입니다. 
코스모스는 꽃잎 길이가 4cm, 꽃받침길이가 1cm입니다. 
*/