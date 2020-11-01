package stacks;

import java.util.Arrays;

public class StackUsingArray {

	int top = -1;
	int stack[];
	int max_limit = 100;

	@Override
	public String toString() {
		return "StackUsingArray [top=" + top + ", stack=" + Arrays.toString(stack) + ", max_limit=" + max_limit + "]";
	}

	public StackUsingArray() {
		// TODO Auto-generated constructor stub
		stack = new int[max_limit];
	}

	public int peek() {
		if (!isEmpty())
			return stack[top];
		else
			return -1;
	}

	public int push(int number) {
		if (isEmpty())
			System.out.println("Stack underflow");
		if (top == max_limit) {
			System.out.println("Stack overflow");
			return -1;
		} else {
			top++;
			stack[top] = number;
		}
			

		return number;
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack underflow");
			return -1;
		}
		int number = stack[top];
		stack[top] = -1;
		top--;
		return number;
	}

	public Boolean isEmpty() {
		if (top == -1)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		StackUsingArray stack = new StackUsingArray();
		System.out.println("Initial stack " + stack);
		stack.push(100);
		System.out.println("Add first element " + stack);
		stack.push(200);
		System.out.println("Add Second element " + stack);
		
		System.out.println("Stack top"+stack.top);
		System.out.println("Peek Stack " + stack.peek());
		
		stack.pop();
		System.out.println("After first pop " + stack);
		System.out.println("Is stack empty " + stack.isEmpty());
		stack.pop();
		System.out.println("After Second pop " + stack);
		System.out.println("Is stack empty " + stack.isEmpty());

	}

}
