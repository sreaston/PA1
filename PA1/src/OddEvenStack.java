import java.util.Arrays;

public class OddEvenStack {

	private int maxStackSize, oddTos, evenTos;
	private int[] stack;

	public OddEvenStack(int maxStackSize) {
		if (maxStackSize <= 0)
			System.out.println("Invalid stack size!");
		else {
			this.maxStackSize = maxStackSize;
			oddTos = -1;
			evenTos = maxStackSize;
			stack = new int[maxStackSize];
		}
	}

	public int size() {
		return oddTos + maxStackSize - evenTos + 1;
	}

	public void push(int val) throws Exception {
		if (oddTos + 1 == evenTos) {
			System.out.println("Stack is full!");
			return;
		}

		if (val % 2 == 0) { // Even number
			evenTos--;
			stack[evenTos] = val;
		} else { // Odd number
			oddTos++;
			stack[oddTos] = val;
		}
	}

	public int popOdd() throws Exception {
		if (oddTos == -1) {
			System.out.println("Odd stack is empty!");
			return -1;
		}
		int poppedValue = stack[oddTos];
		oddTos--;
		return poppedValue;
	}

	public int popEven() throws Exception {
		if (evenTos == maxStackSize) {
			System.out.println("Even stack is empty!");
			return -1;
		}
		int poppedValue = stack[evenTos];
		evenTos++;
		return poppedValue;
	}


	public String toString() {

		return Arrays.toString(stack);
	}
}
