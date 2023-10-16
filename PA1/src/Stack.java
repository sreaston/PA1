public class Stack {

	private int maxStackSize, topOfStack;
	private int[] stack;

	public Stack(int maxStackSize) {
		if (maxStackSize <= 0)
			System.out.println("Invalid stack size!");
		else {
			this.maxStackSize = maxStackSize;
			topOfStack = -1;
			stack = new int[maxStackSize];
		}
	}

	public void push(int val) throws Exception {
		if (topOfStack == maxStackSize - 1) {
			System.out.println("Stack is full!" + val);
			return;
		}
		topOfStack++;
		stack[topOfStack] = val;
	}

	public int pop() throws Exception {
		if (topOfStack == -1) {
			System.out.println("Stack is empty!");
			return -1;
		}
		int poppedValue = stack[topOfStack];
		topOfStack--;
		return poppedValue;
	}

	public int size() {
		return topOfStack + 1;
	}

	public String toString() {
		if (size() == 0)
			return "[]";
		String out = "[";
		for (int i = 0; i < topOfStack; i++)
			out += stack[i] + ", ";
		out += stack[topOfStack] + "]";
		return out;
	}
}
