class Queue {
    int [] arr = new int[5];
    int front = -1;
    int rear = -1;
    
    void enqueu(int data) {
        if (((rear+1)%arr.length) ==front) {
            System.out.println("overflow");
            return;
        }
        else if (front == -1) {
            front = 0;
            rear = 0;
        }
        else {
            rear = (rear + 1) % arr.length;      
        }
        arr[rear] = data;
    }
    
    void dequeu() {
        if (front == -1 ) {
            System.out.println("empty");
        }
        if (front == rear) {
            front = -1;
            rear = -1;
        }
        else {
        front = (front + 1) % arr.length;
        }
    }
    
    int peek() {
        if (front == -1 ) {
            System.out.println("empty");
            return -1;
        }
        return arr[front];
        
    }
    
    void  display() {
        if (front == -1 ) {
            System.out.println("queue is empty");
        }
        int temp = front;
        while (true) {
            System.out.print(arr[temp] + " ");
            if (temp == rear ) {
                break;
            }
            temp = (temp + 1) % arr.length;
        }
        System.out.println();
    }
}

public class arr {
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
