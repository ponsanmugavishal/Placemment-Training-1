class Node {
    int data;
    Node next;
    Node prev;
    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class Queue {
    Node front, rear;
    void insertFront(int data) {
        Node nn = new Node(data);
        if(front == null) {
            front = rear = nn;
        } else {
            nn.next = front;
            front.prev = nn;
            front  = nn;
        }
    }

    void insertRear(int data) {
        Node nn = new Node(data);
        if(rear == null) {
            front = rear = nn;
        } else {
            rear.next = nn;
            nn.prev = rear;
            rear = nn;
        }
    }

    void deleteFront() {
        if(front == null) {
            System.out.println("Queue is empty");
            return;
        }
        if(front == rear) {
            front = rear = null;
        } else {
            front = front.next;
            front.prev = null;
        }
    }
    void deleteRear() {
        if(rear == null) {
            System.out.println("Queue is empty");
            return;
        }
        if(front == rear) {
            front = rear = null;
        } else {
            rear = rear.prev;
            rear.next = null;
        }
    }

    void display() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        Node temp = front;
        while (temp != null) {  
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}

public class LL {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.insertFront(10);
        q.insertFront(20);
        q.insertRear(30);
        q.insertRear(40);
        q.display();
        q.deleteFront();
        q.display();
        q.deleteRear();
        q.display();
    }
}
