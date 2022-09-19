
public class List {
	String[] ary;
	int n;
	int size;
	
	public List() {
		n = 0;
		size = 2;
		ary = new String[size];
	}
	
	public void add(int r, String e) {
		String[] a2;
		
		if (r < 0 || r > n) {
			System.err.println("Error in add.");
			return;
		}
		
		if (n == size ){
			size = size * 2;
			a2 = new String[size];
			for (int i = 0; i < n; i++) {
				a2[i] = ary[i];
			}
			ary = a2;
			System.err.println("Resizing...");
		}
		
		if (r < n) {
			for (int i = n - 1; i >= r; i--) {
				ary[i + 1] = ary[i];
			}
		}
		
		ary[r] = e;
		n++;
		
	}
	
	public String remove(int r) {
		String e;
		if (r >= 0 && r < n) {
			e = ary[r];
			if (r < n - 1) {
				for (int i = r; i < n - 1; i++) {
					ary[i] = ary[i + 1];
				}
			}
			n--;
			return e;
		}
		else {
			return "error";
		}
	}
	
	public  String get(int r) {
		if (r >= 0 && r < n) {
			return ary[r];
		}
		else {
			return "error";
		}
	}
	
	public void set(int r, String e) {
		if (r >= 0 && r < n) {
			ary[r] = e;
		}
		else {
			System.err.println("Error in set");
		}
	}
	
	public String toString() {
		String str = "(";
		
		for (int i = 0; i < n; i++) {
			str += ary[i];
			if(i != n - 1) {
				str += ", ";
			}
		}
		
		str += ")";
		
		return str;
	}
}
