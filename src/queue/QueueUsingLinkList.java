package queue;

public class QueueUsingLinkList {
	Node Front, Rear;

	@Override
	public String toString() {
		return "Queue [Front=" + Front + ", Rear=" + Rear + "]";
	}

	QueueUsingLinkList() {
		Front = Rear = null;
	}

	static class Node {
		int data;
		Node next;

		@Override
		public String toString() {
			return "Node [data=" + data + ", next=" + next + "]";
		}

		Node(int data) {
			this.data = data;
		}

	}

	public Boolean isEmpty() {
		if (Front == null)
			return true;
		else
			return false;
	}

	public int enqueue(int no) {
		Node n = new Node(no);

		if (Rear == null) // if 0 element is present
		{
			Front = Rear = n;
			return no;
		}
		Rear.next = n;
		Rear = n;
		return no;

	}

	public int dequeue() {
		int value = -1;
		if (!isEmpty()) {
			value = Front.data;
			Front = Front.next;
			if (Front == null) {
				Rear = null;
			}
		}

		return value;
	}

	public static void main(String[] args) {
		QueueUsingLinkList queue = new QueueUsingLinkList();
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
		queue.dequeue();
		System.out.println("After removing element " + queue);
	}

}
