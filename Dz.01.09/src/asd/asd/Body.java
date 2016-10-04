package asd.asd;

public class Body {
	int doors;
	String type;
	boolean roof;
	
	public Body(int doors, String type, boolean roof) {
		
		this.doors = doors;
		this.type = type;
		this.roof = roof;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isRoof() {
		return roof;
	}

	public void setRoof(boolean roof) {
		this.roof = roof;
	}

	@Override
	public String toString() {
		return "Body [doors=" + doors + ", type=" + type + ", roof=" + roof + "]";
	}
	
	
	
}
