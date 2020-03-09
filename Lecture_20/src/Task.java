
public class Task implements Runnable{
	
	private SeqBuilder builder;
	
	public Task(SeqBuilder builder) {
		this.builder = builder;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			builder.putNext();
		}
		
		System.out.println(builder);
	}
}
