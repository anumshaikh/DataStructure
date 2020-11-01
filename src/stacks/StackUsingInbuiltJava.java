package stacks;

import java.util.Stack;

public class StackUsingInbuiltJava {
	public static void main(String[] args) 
	{
		Stack<Integer> stack = new Stack<Integer>();
		System.out.println("Initial stack " + stack);
		stack.push(100);
		System.out.println("Add first element " + stack);
		stack.push(200);
		System.out.println("Add Second element " + stack);
		System.out.println("Peek Stack " + stack.peek());

		stack.pop();
		System.out.println("After first pop " + stack);
		System.out.println("Is stack empty " + stack.isEmpty());
		stack.pop();
		System.out.println("After Second pop " + stack);
		System.out.println("Is stack empty " + stack.isEmpty());

	}

}
