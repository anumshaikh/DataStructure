package queue;

import java.util.Arrays;

public class QueueUsingArray {
	int front = -1, rear = -1;

	final int MAX_LIMIT = 5;
	int queue[] = new int[MAX_LIMIT];

	@Override
	public String toString() {
		return "QueueUsingArray [front=" + front + ", rear=" + rear + ", MAX_LIMIT=" + MAX_LIMIT + ", queue="
				+ Arrays.toString(queue) + "]";
	}

	public Boolean isEmpty() {
		if (front == -1) {
			System.out.println("Queue underflow");
			return true;
		} else
			return false;
	}

	public int enqueue(int no) {
		if (isEmpty()) // first element
		{
			front++;
			rear++;
			queue[rear] = no;
		} else {
			// if(rear!=MAX_LIMIT-1)//condition in normal queue
			if (front - 1 == rear) // condiiton for circular queue
				System.out.println("Queue full");
			else {
				if (rear == MAX_LIMIT - 1 && front != 0) {
					rear = 0;
					queue[rear] = no;
				} else
					queue[++rear] = no;
			}

		}
		return no;
	}

	public int dequeue() {
		if (isEmpty()) {

			return -1;
		}
		int value = queue[front];
		queue[front] = -1;
		if (front == rear) {
			front = -1;
			rear = -1;
		} else if (front == MAX_LIMIT - 1) {
			front = 0;
		} else
			front++;
		return value;
	}

	public int getFront() {
		if (!isEmpty())
			return queue[front];
		else
			return -1;
	}

	public int getRear() {
		if (!isEmpty())
			return queue[rear];
		else
			return -1;
	}

	public static void main(String args[]) {
		QueueUsingArray queue = new QueueUsingArray();
		System.out.println("Initial Array \t" + queue);
		queue.enqueue(10);
		System.out.println("After adding 1st element " + queue);
		queue.enqueue(20);
		System.out.println("After adding 2nd element " + queue);
		queue.dequeue();
		System.out.println("After removing element " + queue);
		queue.enqueue(30);
		System.out.println("After adding 2nd element " + queue);
		queue.enqueue(40);
		System.out.println("After adding 2nd element " + queue);
		queue.enqueue(50);
		System.out.println("After adding 2nd element " + queue);
		queue.enqueue(60);
		System.out.println("After adding 2nd element " + queue);
		queue.enqueue(70);
		System.out.println("After adding 2nd element " + queue);
		queue.dequeue();
		System.out.println("After removing element " + queue);
		queue.dequeue();
		System.out.println("After removing element " + queue);
		queue.dequeue();
		queue.dequeue();
		System.out.println("After removing element " + queue);
		queue.dequeue();
		System.out.println("After removing element " + queue);

	}
}
