class Node {
    int data;
    Node next;
    Node front, rear;
    Node(int data) {
        this.data = data;
        this.front = null;
        this.rear = null;
        this.next = null;
    }
}

class Queue {
    Node front, rear;
    
    void enqueu(int data) {
        Node nn = new Node(data);
        if (rear == null) {
            front = nn;
            rear = nn;
        }
        rear.next = nn;
        rear = nn;
    }
    
    void dequeu() {
        if (front == null) {
            System.out.println("empty");
        }
        front = front.next;
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
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class SIMPLE {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueu(10);
        q.enqueu(20);
        q.enqueu(30);
        q.display();
        System.out.println(q.peek());
        q.display();
        q.dequeu();
        System.out.println(q.peek());
        q.display();
    }
}
