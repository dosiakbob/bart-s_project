package asd.asd;

public class Helm {

	String figure;
	int sizeHelm;
	
	public Helm(String figure, int sizeHelm) {
		
		this.figure = figure;
		this.sizeHelm = sizeHelm;
	}
	public String getFigure() {
		return figure;
	}
	public void setFigure(String figure) {
		this.figure = figure;
	}
	public int getSizeHelm() {
		return sizeHelm;
	}
	public void setSizeHelm(int sizeHelm) {
		this.sizeHelm = sizeHelm;
	}
	@Override
	public String toString() {
		return "Helm [figure=" + figure + ", sizeHelm=" + sizeHelm + "]";
	}
	
	
	
	
	
	
}
