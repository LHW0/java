package ch09.ex04;

public class Producer implements Runnable {
	private String name;
	private Buffer buffer;
	
	public Producer(String name, Buffer buffer) {
		this.name = name;
		this.buffer = buffer;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 5; i++)
			buffer.add(i);
			System.out.println(this.name + ": " + name);
			
			try {
				Thread.sleep((int)(Math.random() * 120));
			} catch(InterruptedException e) {}
	}

}
