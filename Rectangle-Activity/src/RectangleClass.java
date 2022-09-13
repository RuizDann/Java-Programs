
public class RectangleClass {
	private double l;
	private double w;
	
	public double getL() {
		return l;
	}
	
	public void setL(int newL) {
		l = newL;
	}
	
	public double getW() {
		return w;
	}
	
	public void setW(int newW) {
		w = newW;
	}
	
	public RectangleClass(int newL, int newW) {
		l = newL;
		w = newW;
	}
	
	public double getP() {
		return (l * 2) + (w * 2);
	}
	
	public double getA() {
		return l * w;
	}
	
}