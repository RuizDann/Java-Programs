
public class StackMain {
	public static void main (String args[]) {
		Stack stack = new Stack(10);
		
		
		stack.push(0);
		stack.push(1);
		stack.push(2);
		
		System.out.println("The top element is " + stack.top());
		
		stack.pop();
		
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		stack.push(9);
		stack.push(10);
		
		System.out.println("The stack size is " + stack.size());
		
		
		if (stack.isEmpty()) {
            System.out.println("The stack is empty");
        }
		else if (stack.isFull()) {
			System.out.println("The stack is full");
		}
        else {
            System.out.println("The stack is not empty");
        }
		
	}
}