
public class ListMain {
	public static void main(String[] args) {
		List l = new List();
	
		System.out.println(l);
		
		l.add(0, "A");
		System.out.println(l);
		
		l.add(0, "B");
		System.out.println(l);
		
		System.out.println(l.get(1));
		System.out.println(l);
		
		l.set(2, "C");
		System.out.println(l);
		
		l.add(2, "C");
		System.out.println(l);
		
		l.add(4, "D");
		System.out.println(l);
		
		l.remove(1);
		System.out.println(l);
		
		l.add(1, "D");
		System.out.println(l);
		
		l.add(1, "E");
		System.out.println(l);
		
		System.out.println(l.get(4));
		System.out.println(l);
		
		l.add(4, "F");
		System.out.println(l);
		
		l.set(2, "G");
		System.out.println(l);
		
		System.out.println(l.get(2));
		System.out.println(l);
		
	}
	
}
