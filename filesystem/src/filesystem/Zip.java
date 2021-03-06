package filesystem;

import java.util.ArrayList;

public class Zip extends Entity {
	protected ArrayList<Entity> contents;
	
	public Zip(String n, Folder p) {
		super(n, p);
		contents = new ArrayList<Entity>();
	}

	@Override
	protected void getType() {
		System.out.println("Zip file");
	}

	@Override
	protected int size() {
		int size = 0;
		for (Entity e : contents) {
			size += e.size();
		}
		return size/2;	// 1/2 sum of sizes of all entities it contains.
	}

	// Exception "path not found" implemented in main() function.
	public boolean deleteEntity(Entity entity) {
		return contents.remove(entity);
	}
	
	// Exception (path not found, path already exists) implemented in main().
	public void addEntity(Entity entity) {
		contents.add(entity);
	}
}
