class aull{
    int[] arr = new int [6];
    int top = -1;
    void insert(int data) {
        if (top < arr.length - 1) {
            top++;
            arr[top] = data;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    int delete() {
        if (top == -1) {
            System.out.println("underflow");
            return -1;
        }
        else {
            int data = arr[top];
            top--;
            return data;
        }
    }

    int peek() {
        if (top == -1) {
            return -1;
        }
        else{
            return arr[top];
        }
    }

    boolean isEmpty() {
        return top == -1;
    }
}

public class arr {
    public static void main(String[] args) {
        aull s = new aull();
        s.insert(10);
        s.insert(20);
        s.insert(30);
        s.insert(50);
        s.insert(60);
        System.out.println(s.peek());
        System.out.println(s.delete());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
        s.insert(40);
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
    }
}