import java.util.ArrayList;
import java.util.List;

public class SeqBuilder {
	private int value;
	private List<Integer> data;

	public SeqBuilder() {
		value = 0;
		data = new ArrayList<>();
	}

	public synchronized void putNext() {
		value = value + 1;
		data.add(value);
	}

	@Override
	public synchronized String toString() {
		return data.toString();
	}
}
