
public class RectangleMain {
	public static void main(String args[]) {
		RectangleClass ary[];
		int arySize = 5;
		int i;
		double maxP = 0;
		double maxA = 0;
		int rec1 = 0;
		int rec2 = 0;

		ary = new RectangleClass[arySize];
		
		System.out.print("ID\t");
		
		for (i = 0; i < ary.length; i++) {
			int l = (int)(Math.random() * 5 + 2);
			int w = (int)(Math.random() * 5 + 2);
			ary[i] = new RectangleClass(l, w);
			
			if (ary[i].getP() > maxP) {
				maxP = ary[i].getP();
				rec1 = i + 1;
			}
			if (ary[i].getA() > maxA) {
				maxA = ary[i].getA();
				rec2 = i + 1;
			}
			
			System.out.print(i+1 +"\t");
		}
		
		System.out.println("");
		System.out.print("Length\t");
		
		for (i = 0; i < ary.length; i++) {
			System.out.print(ary[i].getL() + "\t");
		}
		
		System.out.println("");
		System.out.print("Width\t");
		
		for (i = 0; i < ary.length; i++) {
			System.out.print(ary[i].getW() + "\t");
		}
		
		System.out.println("");
		System.out.println("Rectangle " + rec1 + " has the largest Area: " + "(" + maxA + ")");
		System.out.println("Rectangle " + rec2 + " has the largest Perimeter: " + "(" + maxP + ")");
	}
}