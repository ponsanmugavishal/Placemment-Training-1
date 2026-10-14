class Node{
	int data;
	int p;
	Node next;
	Node(int data,int p){
		this.data = data;
		this.p=p;
		this.next = null;
	}
}
class PriorityQue {
	Node front =null;
	public void enqueue(int data, int p) {
		Node nn = new Node(data,p);
		if(front == null || p < front.p) {
			nn.next=front;
			front = nn;
		}
		else {
			Node temp = front;
			while(temp.next!=null && temp.next.p<=p) {
				temp = temp.next;
			}
			nn.next=temp.next;
			temp.next=nn;
		}
	}
	public void dequeue() {
		if(front==null) {
			System.out.println("Empty");
		}
		else {
			System.out.println("Deleted data:"+ front.data);
			front = front.next;
		}
	}
	public void disp() {
		if(front==null) {
			System.out.println("Empty");
		}
		else {
			Node temp = front;
			while(temp!=null) {
				System.out.println(temp.data + " p-->"+ temp.p);
				temp = temp.next;
			}
		}
	}
}
public class LL{
	public static void main(String args[]) {
		PriorityQue q = new PriorityQue();
		q.enqueue(20, 1);
		q.enqueue(30, 2);
		q.enqueue(40, 3);
		q.disp();
		q.dequeue();
	}
	
}