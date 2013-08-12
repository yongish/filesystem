package filesystem;

public class TextFile extends Entity {
	private String content;
	private int size;
	
	public TextFile(String n, Folder p, int sz) {
		super(n, p);
		size = sz;
	}
	
	public boolean writeToFile(String content){
		return true;
	}

	@Override
	protected void getType() {
		System.out.println("Text File");
	}

	@Override
	protected int size() {
		return size;
	}
	
	public String ReadFile() {
		return content;
	}

	public void WriteToFile(String content) {
		this.content = content;
	}
}
