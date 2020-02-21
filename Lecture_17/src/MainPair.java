
public class MainPair {

	public static void main(String[] args) {
		Pair<String, String> p1 = new Pair<>("300642444", "45");
		Pair<Integer, String> p2 = new Pair<>(127, "300642444");

		String key = p1.getKey();
		String value = p1.getValue();
		
		int key2 = p2.getKey();
		String value2 = p2.getValue();

	}

}
