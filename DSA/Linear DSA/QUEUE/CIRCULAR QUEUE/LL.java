class Node {
    int data;
    Node next;
    Node front = null;
    Node rear = null;
    Node(int data) {
        this.data = data;
        this.next = null;
        this.front = null;
        this.rear = null;
    }
}

class Queue {
    Node front, rear;

    void enqueue(int data) {
        Node  nn = new  Node(data);
        if (rear == null) {
            front = nn;
            nn.next = front;
            rear = nn;
        }
        nn.next = front;
        rear.next = nn;
        rear = nn;
    }
    
    void dequeue() {
        if (front == null){
            System.out.println("underflow");
        }
        if (front == rear) {
            front = rear = null;
        }
        else {
            front = front.next;
            rear.next = front;
        }
    }

    int peek() {
        if (front == null) {
            System.out.println("empty");
            return -1;
        }
        return front.data;
        
    }
    
    void  display() {
        if (front == null) {
            System.out.println("queue is empty");
        }
        Node temp = front;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != front);
        System.out.println();
    }
}

public class  LL{
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        q.dequeue();
        q.display();
        System.out.println(q.peek());
    }
}
