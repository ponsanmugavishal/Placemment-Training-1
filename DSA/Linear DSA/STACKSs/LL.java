class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class sull {
    Node top;
    void push(int data)  {
        Node nn = new Node(data);
        nn.next = top;
        top = nn;
    }

    int pop() {
        if (top == null) {
            System.out.println("Underflow");
            return -1;
        }
        else {
            int data = top.data;
            top = top.next;
            return data;
        }
    }

    int peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        else {
            System.out.println(top.data);
            return top.data;
        }
    }

    boolean isEmpty() {
        return top == null;
    }
}


public class LL {
    public static void main(String[] args) {
        sull s = new sull();
        s.push(10);
        s.push(20);
        s.push(30);
        s.peek();
        System.out.println(s.pop());
        s.peek();
        System.out.println(s.isEmpty());
        s.push(40);
        s.peek();
        System.out.println(s.isEmpty());
    }
}
//51