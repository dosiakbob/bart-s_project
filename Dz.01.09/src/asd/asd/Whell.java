package asd.asd;

public class Whell {
	int size;
	int inch;
	String material;
	
	
	public Whell(int size, int inch, String material) {
		
		this.size = size;
		this.inch = inch;
		this.material = material;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public int getInch() {
		return inch;
	}


	public void setInch(int inch) {
		this.inch = inch;
	}


	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) {
		this.material = material;
	}


	@Override
	public String toString() {
		return "Whell [size=" + size + ", inch=" + inch + ", material=" + material + "]";
	}
	
	
	
	
}
