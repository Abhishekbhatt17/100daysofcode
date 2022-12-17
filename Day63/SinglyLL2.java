package Day63;

public class SinglyLL2  {
	Node head; 

	class Node {
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	
	public void push(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	void deleteNode(int position)
	{
		
		if (head == null)
			return;

		Node temp = head;

		if (position == 0) {
			head = temp.next; 
			return;
		}

		for (int i = 0; temp != null && i < position - 1;
			i++)
			temp = temp.next;

		if (temp == null || temp.next == null)
			return;

		Node next = temp.next.next;

		temp.next
			= next; 
	}
	public void printList()
	{
		Node tnode = head;
		while (tnode != null) {
			System.out.print(tnode.data + " ");
			tnode = tnode.next;
		}
	}
	public static void main(String[] args)
	{
		SinglyLL2 llist = new SinglyLL2();

		llist.push(7);
		llist.push(1);
		llist.push(3);
		llist.push(2);
		llist.push(8);

		System.out.println("\nCreated Linked list is: ");
		llist.printList();

		llist.deleteNode(3); // Delete node at position 3

		System.out.println(
			"\nLinked List after Deletion at position 3: ");
		llist.printList();
	}
}


