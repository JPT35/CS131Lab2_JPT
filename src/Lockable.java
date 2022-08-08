public interface Lockable {

	boolean isLocked ();
	
	public void setKey(int key);
	
	public void lock (int key);
	
	public void unlock (int key);
	
	
	
	
}//end interface