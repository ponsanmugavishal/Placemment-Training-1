class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class sll{
    Node head;
    public void insert_first(int data) {
        Node nn = new Node(data);
        if (head == null) {
            head = nn;
            nn.next = head;
            return;
        }
        else {
            nn.next  = head;
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = nn;
            nn = head;
        }
    }
    
    public void insert_last(int data) {
        Node nn = new Node(data);
        if (head == null) {
            insert_first(data);
        }
        else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = nn;
            nn.next = head;
        }
    }

    public void insert_pos(int data, int pos) {
        Node nn = new Node(data);
        if (head == null) {
            insert_first(data);
        }
        else if (pos == 0) {
            insert_first(data);
        }
        else {
            Node temp = head;
            for (int i = 1; i < pos - 1; i++) {
                temp = temp.next;
            }
            nn.next = temp.next;
            temp.next = nn;
        }
    }

    public void delete_first() {
        if (head == null) {
            System.out.println("list is empty");
        }
        else if (head.next == head) {
            head = null;
        }
        else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            head = head.next;
            temp.next = head;
        }
    }

    public void delete_last() {
        if (head == null) {
            System.out.println("list is empty");
        }
        else if (head.next == head) {
            head = null;
        }
        else {
            Node temp = head;
            while (temp.next.next != head) {
                temp = temp.next;
            }
            temp.next = head;
        }
    }

    public void delete_pos(int pos) {
        if (head == null) {
            System.out.println("list is empty");
        }
        else if (pos == 0) {
            delete_first();
        }
        else {
            Node temp = head;
            for (int i = 1; i < pos - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("list is empty");
        }
        else {
            Node temp =  head;
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head);
            System.out.println();
        }
    }
}

public class CSLL {
    public static void main(String[] args) {
        sll list = new sll();
        list.insert_first(10);
        list.display();
        list.insert_last(20);
        list.display();
        list.insert_last(30);
        list.display();
        list.insert_pos(15, 1);
        list.display();
        list.delete_first();
        list.display();
        list.delete_last();
        list.display();
        list.delete_pos(0);
        list.display(); 
    }

}