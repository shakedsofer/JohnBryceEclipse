
public class Box<T> {
	private T content;

	public T getContent() {
		return content;
	}
	
	public void setContent(T content) {
		this.content = content;
	}
	
	public String toString() {
		return content.toString();
	}
}
