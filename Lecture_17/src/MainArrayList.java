import java.util.ArrayList;

public class MainArrayList {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();
		// Adding to the list.
		names.add("Zechariah");
		names.add("Yehuda");
		names.add("Itzhak");
		names.add("Liz");
		names.add("Dima");
		names.add("Aharon");
		names.add("Avinadav");
		names.add("Sofia");
		names.add("Dvir");
		names.add("Tziporah");
		names.add("Omer");
		// Removing from the list.
		names.remove("Dvir");
		// Iterate over the list.
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		// Contains:
		System.out.println("Contains");
		System.out.println("--------");
		if (names.contains("Aharon")) {
			int index = names.indexOf("Aharon");
			System.out.printf("Aharon is in the names list, he was found at index: %d\n", index);
		} else {
			System.out.println("Aharon was not found in the list.");
		}
		
		// Add at:
		names.add(4, "Avidan");

		System.out.println("With toString():");
		System.out.println("----------------");
		System.out.println(names);
		
		// Iterating with for-each loop:
		for(String element : names) {
			System.out.println(element);
		}
	}

}
