
class DequeArray {
    int[] arr = new int[5];
    int front = -1;
    int rear = -1;
    public void insertFront(int data) {
        if (front == 0) {
            System.out.println("Deque is Full at Front");
            return;
        }
        if (front == -1) {
            front = rear = 0;
        } else {
            front--;
        }
        arr[front] = data;
    }
    public void insertRear(int data) {
        if (rear == arr.length - 1) {
            System.out.println("Deque is Full at Rear");
            return;
        }

        if (front == -1) {
            front = rear = 0;
        } else {
            rear++;
        }

        arr[rear] = data;
    }

    public void deleteFront() {
        if (front == -1) {
            System.out.println("Deque is Empty");
            return;
        }

        System.out.println("Deleted: " + arr[front]);

        if (front == rear) {
            front = rear = -1;
        } else {
            front++;
        }
    }

    public void deleteRear() {
        if (rear == -1) {
            System.out.println("Deque is Empty");
            return;
        }

        System.out.println("Deleted: " + arr[rear]);

        if (front == rear) {
            front = rear = -1;
        } else {
            rear--;
        }
    }

    public void display() {
        if (front == -1) {
            System.out.println("Deque is Empty");
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class Arr {
    public static void main(String[] args) {

        DequeArray d = new DequeArray();

        d.insertRear(10);
        d.insertRear(20);
        d.display();
        d.insertFront(5);
        d.display();
        d.insertFront(1);
        d.display();
        d.deleteFront();
        d.display();
        d.deleteRear();
        d.display();
    }
}