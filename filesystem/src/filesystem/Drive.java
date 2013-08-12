package filesystem;

import java.util.ArrayList;

public class Drive {
	protected String name;
	protected ArrayList<Entity> contents;
	
	public Drive(String n, Folder p) {
		name = n;
		contents = new ArrayList<Entity>();
	}
	

	protected void getType() {
		System.out.println("Drive");
	}

	protected int size() {
		int size = 0;
		for (Entity e : contents) {
			size += e.size();
		}
		return size;
	}

}
