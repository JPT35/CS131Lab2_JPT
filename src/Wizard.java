public class Wizard implements Lockable {

	protected String name;
	int health;
	protected int key;
	protected boolean locked;
	protected int power;
	
	
	public Wizard() {
		
		//initializing variables
		this.name = "";
		this.health = 0;
		this.key = 0;
		this.locked = false;
		this.power = 0;
	
	}//end empty argument
	
	public Wizard(String name) {
		this.setName(name);
		this.health = 0;
		this.key = 0;
		this.locked = false;
		this.power = 0;
		
	}//end constructor
	
	public void takeDamage(int power) {
	
	this.power = power;
	
		if (!locked) {
			health-=power;
		}//end if 
		
	}//end takeDamage
	
	public String getName() {
		return name;
	}//end getName
	
	public void setName(String name) {
		this.name = name;
	}//end setName
	
	public int getHealth() {
		return health;
	}//end getHealth
	
	public void setHealth(int health) {
		this.health = health;
	}//end setHealth
	
	public int getKey() {
		return key;
	}//end getKey
	
	public void setKey(int key) {
				
		if (key > 0 && this.key == 0) {
			this.key = key;
		}//end if 
		
	}//end setKey
	
	public boolean isLocked() {
		return locked;
	}//end isLocked

	
	@Override
	public String toString() {
		return "Wizard [name=" + name + ", health=" + health + ", key=" + key + ", locked=" + locked + "]";
	}//end toString

	@Override
	public void lock(int key) {
		
		if (this.key == key) {
		locked = true;
		}//end if 
		
	}

	@Override
	public void unlock(int key) {
		
		if (this.key == key) {
			locked = false;
		}//end if 
		
	}//end unlock

}//end class