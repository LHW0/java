package ch05.ex01.case04;

public class User {
	private String name;
	
	public void setname(String name) {
		char familyName = name.charAt(0);
		
		if(familyName == '��')
			this.name = name;
		else this.name = "��������?";
	}
	
	public String getName() {
		return this.name;
	}
	

}