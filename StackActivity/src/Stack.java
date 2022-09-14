
public class Stack {
	private int ary[];
	private int top;
	private int size;
	
	public void push(int e) {
		if(isFull()) {
			System.out.println("Stack is full.");
			System.exit(-1);
		}
		
		System.out.println("Pushing: " + e);
		ary[++top] = e;
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty.");
			System.exit(-1);
		}
		
		System.out.println("Popped: " + top());
		return ary[top--];
	}
	
	public int top() {
		if (!isEmpty()) {
			return ary[top];
		}
		else {
			System.exit(-1);
		}
		
		return -1;
	}
	
	public int size() {
		return top + 1;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == size - 1;
	}
	
	Stack(int capacity) {
		ary = new int[capacity];
		size = capacity;
		top = -1;
	}
}