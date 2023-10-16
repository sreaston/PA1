public class Queue {

	private int maxQueueSize, front, rear, currentSize;
	private int[] queue;

	public Queue(int maxQueueSize) {
		if (maxQueueSize <= 0)
			System.out.println("Invalid queue size!");
		else {
			this.maxQueueSize = maxQueueSize;
			front = rear = currentSize = 0;
			queue = new int[maxQueueSize];
		}
	}

	public void enqueue(int val) throws Exception {
		if (isFull()) {
			throw new Exception("Queue is full!");
		}
		queue[rear] = val;
		rear = (rear + 1) % maxQueueSize;
		currentSize++;
	}

	public int dequeue() throws Exception {
		if (isEmpty()) {
			throw new Exception("Queue is empty!");
		}
		int dequeuedValue = queue[front];
		front = (front + 1) % maxQueueSize;
		currentSize--;
		return dequeuedValue;
	}

	public int size() {
		return currentSize;
	}

	public boolean isEmpty() {
		return currentSize == 0;
	}

	public boolean isFull() {
		return currentSize == maxQueueSize;
	}

	public String toString() {
		if (size() == 0)
			return "[]";
		else {
			String output = "[";
			if (rear > front) {
				for (int i = front; i < rear - 1; i++)
					output += queue[i] + ", ";
				output += queue[rear - 1] + "]";
			} else {
				for (int i = front; i < maxQueueSize - 1; i++)
					output += queue[i] + ", ";
				output += queue[maxQueueSize - 1];

				for (int i = 0; i < rear; i++)
					output += ", " + queue[i];
				output += "]";
			}
			return output;
		}
	}
}
