package linkedlist;

public class CreateLinkList {

	Node head;

	static class Node {
		String data;
		Node next;

		Node(String data) {
			this.data = data;
			next = null;
		}
	}

	public void printList() {
		System.out.println("Printing List");
		Node n = head;
		while (n != null) {
			System.out.println("Data present " + n.data);
			n = n.next;
		}
	}

	public void insertAtBegin(String data) {
		Node n = new Node(data);
		Node prevNode = head;
		head = n;
		n.next = prevNode;
	}

	public void insertAtEnd(String data) {
		Node n = new Node(data);
		Node nhead = head;
		if (head == null) {
			head = n;
			return;
		}
		while (nhead.next != null) {
			nhead = nhead.next;
		}
		nhead.next = n;
	}

	public void insertAtMiddle(String data, String afterData) {
		Node nhead = head;
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		while (nhead.next != null) {
			if (nhead.data.equals(afterData)) {
				System.out.println("Found node " + nhead.data);
				newNode.next = nhead.next;
				nhead.next = newNode;
				break;
			} else
				nhead = nhead.next;
		}

	}

	public void insertNodeAtposition(String data, int position) {
		Node nhead = head;
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		int i = 1;

		while (nhead.next != null) {
			if (i == position) {
				System.out.println("Found node " + nhead.data);
				newNode.next = nhead.next;
				nhead.next = newNode;
				break;
			} else {
				nhead = nhead.next;
				i++;
			}

		}
	}

	public void deleteAtBegin() {
		Node temp = head;
		head = temp.next;
		temp = null;
	}

	public void deleteAtEnd() {
		Node temp = head;
		if (head == null)
			return;
		if (head.next == null) {
			head = null;
			return;
		}
		while (temp.next.next != null) {
			temp = temp.next;
		}
		System.err.println(temp.next.data);
		temp.next = null;
	}

	public void deleteAfter(String data) {
		Node temp = head;
		while (temp.next != null) {
			if (temp.data.equals(data)) {
				temp.next = temp.next.next;
				return;
			}
			temp = temp.next;
		}
	}

	public void deleteAtPosition(int position) {
		int i = 1;
		Node temp = head;
		if (temp == null)
			return;
		if (position == 0) {
			head = head.next;
			return;
		} else {
			while (temp.next != null) {
				if (i == position) {
					temp.next = temp.next.next;
					return;
				}
			}
		}

	}

	public void ReversePrint(Node temp) {
		if (temp != null) {
			ReversePrint(temp.next);
			System.out.println(temp.data);
		}
	}

	public void ReverseList() {
		Node current = head;
		if (current == null)
			return;
		
		Node nextnode =null;
		Node prevnode =null;
		while(current != null)
		{
			
		 	nextnode = current.next;
			current.next = prevnode;
			prevnode = current;
			current= nextnode;
		}
		head=prevnode;

		System.out.println("Reverse Printing List");
		Node n = head;
		while (n != null) {
			System.out.println("Data present " + n.data);
			n = n.next;
		}

	}

	public static void main(String[] args) {
		CreateLinkList LL = new CreateLinkList();
		LL.head = new Node("anum");
		Node second = new Node("sara");
		Node third = new Node("anjum");

		LL.head.next = second;
		second.next = third;
		third.next = null;

		/*LL.printList();
		System.err.println("After inset at begin");
		LL.insertAtBegin("Mujeeb");
		LL.printList();

		System.err.println("After insert at end");
		LL.insertAtEnd("Arshi");
		LL.printList();

		System.err.println("After insert at between");
		LL.insertAtMiddle("Rahil", "anjum");
		LL.printList();

		System.err.println("After delete at begin");
		LL.deleteAtBegin();
		LL.printList();

		System.err.println("After delete at end");
		LL.deleteAtEnd();
		LL.printList();

		System.err.println("After delete at Middle");
		LL.deleteAfter("sara"); */
		LL.printList();

		LL.ReverseList();
	}

}
