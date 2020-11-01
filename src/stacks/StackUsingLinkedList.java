package stacks;

public class StackUsingLinkedList {
	Node top;

	@Override
	public String toString() {
		return "StackUsingLinkedList [top=" + top + "]";
	}

	public StackUsingLinkedList() {
		top = null;
	}

	static class Node {
		String data;
		Node next;

		@Override
		public String toString() {
			return "Node [data=" + data + ", next=" + next + "]";
		}

		Node(String data) {
			this.data = data;
			this.next = null;
		}

		Node() {
			this.data = null;
			this.next = null;
		}
	}

	public Boolean isEmpty() {
		if (top == null)
			return true;
		else
			return false;
	}

	public Boolean push(String element) {
		Node node = new Node(element);
		if (isEmpty()) {
			top = node;
		} else 
		{
			node.next = top;
			top = node;
		}
		return true;
	}

	public String pop() {
		if (isEmpty()) 
		{
			System.out.println("Stack underflow");
			return null;
		}
		String value = top.data;
		if (top.next == null)
			top = null;
		else
			top = top.next;
		return value;
	}
	
	public String peek() {
		if(!isEmpty()) {
			return top.data;
		}
		else
		{
			System.out.println("Stack underflow");
			return null;
		}
	}

	public static void main(String[] args) {
		StackUsingLinkedList stack = new StackUsingLinkedList();
		System.out.println("Initial stack " + stack);
		stack.push("Anum");
		System.out.println("Add first element " + stack);
		stack.push("Sara");
		System.out.println("Add Second element " + stack);
		
		
		System.out.println("peek at stack "+stack.peek());
		
		stack.pop();
		System.out.println("\nAfter first pop " + stack);
		System.out.println("Is stack empty " + stack.isEmpty());
		System.out.println("peek at stack "+stack.peek()); 
		
		stack.pop();
		System.out.println("\nAfter Second pop " + stack);
		System.out.println("Is stack empty " + stack.isEmpty());
		System.out.println("peek at stack "+stack.peek());

	}

}
