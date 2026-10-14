class Queue {
    int [] arr = new int[5];
    int front = 0;
    int rear = -1;
    
    void enqueu(int data) {
        if (rear == arr.length - 1) {
            System.out.println("overflow");
            return;
        }
        rear++;
        arr[rear] = data;
    }
    
    void dequeu() {
        if (front > rear) {
            System.out.println("empty");
        }
        front++;
    }
    
    int peek() {
        if (front > rear ) {
            System.out.println("empty");
            return -1;
        }
        return arr[front];
        
    }
    
    void  display() {
        if (front > rear) {
            System.out.println("queue is empty");
        }
        int temp = front;
        while (temp != rear + 1) {
            System.out.print(arr[temp] + " ");
            temp++;
        }
        System.out.println();
    }
}

public class simplearr {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueu(10);
        q.enqueu(20);
        q.enqueu(30);
        q.enqueu(50);
        q.enqueu(60);
        System.out.println(q.peek());
        q.display();
        q.dequeu();
        System.out.println(q.peek());
        q.display();
        q.enqueu(40);
        System.out.println(q.peek());
        q.display();
    }
}
