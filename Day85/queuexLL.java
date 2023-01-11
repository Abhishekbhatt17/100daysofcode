package Day85;

class QNode {
	int key;
	QNode next;

	public QNode(int key)
	{
		this.key = key;
		this.next = null;
	}
}
class Queue {
	QNode front, rear;

	public Queue() { this.front = this.rear = null; }

	void enqueue(int key)
	{
		QNode temp = new QNode(key);

		if (this.rear == null) {
			this.front = this.rear = temp;
			return;
		}

		this.rear.next = temp;
		this.rear = temp;
	}

	void dequeue()
	{
		if (this.front == null)
			return;
            
		this.front = this.front.next;

		if (this.front == null)
			this.rear = null;
	}
}

public class queuexLL {
	public static void main(String[] args)
	{
		Queue q = new Queue();
		q.enqueue(100);
		q.enqueue(200);
		q.dequeue();
		q.dequeue();
		q.enqueue(300);
		q.enqueue(400);
		q.enqueue(500);
		q.dequeue();
		System.out.println("Queue Front : " + q.front.key);
		System.out.println("Queue Rear : " + q.rear.key);
	}
}


