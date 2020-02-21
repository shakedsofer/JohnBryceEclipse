import java.net.MalformedURLException;
import java.net.URL;

public class URLHelper {

	public URL createUrl(String address) throws MalformedURLException {
		return new URL(address);
	}
}
