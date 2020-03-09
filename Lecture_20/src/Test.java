
public class Test {

	public static void main(String[] args) {
		
		SeqBuilder seqBuilder = new SeqBuilder();
		
		Task seriesPrinter1 = new Task(seqBuilder);
		Task seriesPrinter2 = new Task(seqBuilder);
		Task seriesPrinter3 = new Task(seqBuilder);
		Task seriesPrinter4 = new Task(seqBuilder);
		Task seriesPrinter5 = new Task(seqBuilder);
		
		Thread thread1 = new Thread(seriesPrinter1);
		Thread thread2 = new Thread(seriesPrinter2);
		Thread thread3 = new Thread(seriesPrinter3);
		Thread thread4 = new Thread(seriesPrinter4);
		Thread thread5 = new Thread(seriesPrinter5);
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
	}
}
