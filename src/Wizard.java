public class Wizard implements Lockable {

	protected String name;
	protected int health;
	protected int key;
	protected boolean locked;
	protected int power;
	
	
	public Wizard() {
		this.name = "";
		this.health = 0;
		this.key = 0;
		this.locked = true;
		this.power = 0;
	
	}//end empty argument
	
	public Wizard(String name, int health, int key, boolean locked) {
		this.setName(name);
		this.setHealth(health);
		this.setKey(key);
		this.setLocked(locked);
		
	}//end constructor
	
	public void takeDamage(int power) {
	
	this.power = power;
	
		if (locked) {
			System.out.println("Remaining Health: "+(health-=power));
	}//end if
		if (locked == false) {
			System.out.println("Sheild active, remaining health: "+health);
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
		
		this.key = key;
		
	}//end setKey
	
	public boolean isLocked() {
		return locked;
	}//end isLocked

	public void setLocked(boolean locked) {
		
		if (key > 0) {
		this.locked = locked;
		}//end if
		
	}//end setLocked
	
	@Override
	public String toString() {
		return "Wizard [name=" + name + ", health=" + health + ", key=" + key + ", locked=" + locked + "]";
	}//end toString

	@Override
	public void lock(int key) {
		
		if (this.key > 0) {
		
		}//end if 
		
	}

	@Override
	public void unlock(int key) {
		if (this.key <= 0) {
			
		}//end if 
		
	}

}//end class