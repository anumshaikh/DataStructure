package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingInbuiltJava 
{
	public static void main(String args[] ) {
		Queue<Integer> queue = new LinkedList<Integer>();
		System.out.println("Initial Array \t" + queue);
		queue.add(10);
		System.out.println("After adding 1st element " + queue);
		queue.add(20);
		System.out.println("After adding 2nd element " + queue);
		queue.remove();
		System.out.println("After removing element " + queue);
		queue.add(30);
		System.out.println("After adding 2nd element " + queue);
		queue.remove(40);
		System.out.println("After adding 2nd element " + queue);
		queue.add(50);
		System.out.println("After adding 2nd element " + queue);
		queue.add(60);
		System.out.println("After adding 2nd element " + queue);
		queue.add(70);
		System.out.println("After adding 2nd element " + queue);
		queue.remove();
		System.out.println("After removing element " + queue);
		queue.remove();
		System.out.println("After removing element " + queue);
		queue.remove();
		queue.remove();
		System.out.println("After removing element " + queue);
		queue.remove();
		System.out.println("After removing element " + queue);
		queue.remove();
		System.out.println("After removing element " + queue);
	}
}
