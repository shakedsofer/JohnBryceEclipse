import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestExceptions {

	public static void main(String[] args) {
		openFile("O://java_test123.txt");

		System.out.println("Bye!");
	}

	private static void openFile(String path) {
		File file = new File(path);

		try {
			FileReader reader = new FileReader(file);
			// ...
			// ...
			// ...
		} catch (FileNotFoundException ex) {
			System.out.println("The file was not found.");
		}

		System.out.println("End of openFile");

	}

}
