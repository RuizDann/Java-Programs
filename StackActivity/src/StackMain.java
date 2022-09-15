
public class StackMain {
	public static void main (String args[]) {
		
		int mySize = 5;
		Stack stack = new Stack(mySize);
		int val = 1;
		
		for (int i = 0; i < 10; i++) {
			stack.push(val);
			val++;
		}
		
		while (stack.isEmpty() == false) {
			stack.pop();
			if (stack.isEmpty()) {
            System.out.println("The stack is empty");
			}
			else {
				continue;
			}
		}
		
		
		
		

		
	}
}