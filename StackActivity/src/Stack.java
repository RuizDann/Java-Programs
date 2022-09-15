
public class Stack {
	private int ary[];
	private int top;
	private int maxSize;

	public void push(int e) {
		int newAry[];
		if(top == maxSize - 1) {
			maxSize = maxSize * 2;
			newAry = new int[maxSize];
			for(int i = 0; i <= top; i++) {
				newAry[i] = ary[i];
			}
			ary = newAry;
		}
		
		System.out.println("Pushing: " + e);
		
		top++;
		ary[top] = e;
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
	
	Stack(int capacity) {
		ary = new int[capacity];
		maxSize = capacity;
		top = -1;
	}
}