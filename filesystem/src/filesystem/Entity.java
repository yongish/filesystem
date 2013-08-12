package filesystem;

public abstract class Entity {
	 
	// Type
	protected abstract void getType();
	
	// Name
	protected String name;

	// Path
	protected Folder parent;
	public String getFullPath() {
		if (parent == null) {
			return name;
		}
		return parent.getFullPath() + "/" + name;
	}
	
	// Create
	public Entity (String n, Folder p) {
		name = n;
		parent = p;
	}
	
	// Delete
	public boolean delete() {
		if (parent == null) {
			return false;
		}
		return parent.deleteEntity(this);
	}
	

	// Move
	public void move(Folder to) {
		parent = to;
	}
	
	// Size
	protected abstract int size();
	
}
