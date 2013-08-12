package filesystem;

import java.util.ArrayList;

public class Folder extends Entity {
	protected ArrayList<Entity> contents;
	
	public Folder(String n, Folder p) {
		super(n, p);
		contents = new ArrayList<Entity>();
	}
	
	public boolean deleteEntity(Entity entity) {
		return contents.remove(entity);
	}

	@Override
	protected void getType() {
		System.out.println("Folder");
	}

	@Override
	protected int size() {
		int size = 0;
		for (Entity e : contents) {
			size += e.size();
		}
		return size;
	}

	// Exception (path not found, path already exists) implemented in main().
	public void addEntity(Entity entity) {
		contents.add(entity);
	}

	
	
}
