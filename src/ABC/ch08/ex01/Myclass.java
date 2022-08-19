package ABC.ch08.ex01;

@Type(name="class", value=1)
public class Myclass {
	@Field(1)
	private String name;
	
	@Constructor
	public Myclass() {
		
	}
	@Method
	public void play(@Param String name, @Param int age) { 
		@Local int i = 0;
	}

}
