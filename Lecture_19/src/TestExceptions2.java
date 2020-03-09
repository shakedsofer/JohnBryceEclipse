import java.net.MalformedURLException;
import java.net.URL;

public class TestExceptions2 {

	public static void main(String[] args) {
		try {
			URL url = createUrl("www.google.com");
		} catch (MalformedURLException e) {
			System.out.println("Unknown address!");
		}
		
		System.out.println("Bye!");
	}

	private static URL createUrl(String path) throws MalformedURLException {
		return new URL(path);
	}
}
