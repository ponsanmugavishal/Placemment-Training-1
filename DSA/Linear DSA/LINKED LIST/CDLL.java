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

class dll {
    Node head;

    public void insert_first(int data) {
        Node nn = new Node(data);

        if (head == null) {
            head = nn;
            head.next = head;
            head.prev = head;
        } 
        else {
            nn.next = head;
            nn.prev = head.prev;

            head.prev.next = nn;  
            head.prev = nn;       

            head = nn;
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
            nn.next = head;
            nn.prev = temp;
            temp.next = nn;
            head.prev = nn;
        }
    }

    public void insert_pos(int data, int pos) {
        Node nn = new Node(data);
        if (pos == 0) {
            insert_first(data);
            return;
        }
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;
        }
        nn.next = temp.next;
        nn.prev = temp;
        temp.next.prev = nn;
        temp.next = nn;
    }

    public void delete_first() {
        if (head == null) {
            System.out.println("List is empty");
        } 
        else if (head.next == head) {
            head = null;
        } 
        else {
            head.prev.next = head.next;
            head.next.prev = head.prev;
            head = head.next;
        }
    }

    public void delete_last() {
        if (head == null) {
            System.out.println("List is empty");
        } 
        else if (head.next == head) {
            head = null;
        } 
        else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.prev.next = head;
            head.prev = temp.prev;
        }
    }

    public void delete_pos(int pos) {
        if (head == null) {
            System.out.println("List is empty");
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
            temp.next.prev = temp;
        }
    }

    // Display
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
        } 
        else {
            Node temp = head;

            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head);

            System.out.println();
        }
    }
}

public class CDLL {
    public static void main(String[] args) {

        dll obj = new dll();

        obj.insert_first(10);
        obj.insert_last(20);
        obj.insert_last(30);
        obj.insert_last(40);

        obj.display();

        obj.delete_pos(2);
        obj.display();

        obj.delete_last();
        obj.insert_first(20);
        obj.display();
    }
}