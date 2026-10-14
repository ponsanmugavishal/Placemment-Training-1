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

class Dll {
    Node head;

    public void insert_first(int data) {
        Node nn = new Node(data);

        if (head == null) {
            head = nn;
        } 
        else {
            nn.next = head;
            head.prev = nn;
            head = nn;
        }
    }

    public void insert_last(int data) {
        Node nn = new Node(data);

        if (head == null) {
            head = nn;
        } 
        else {
            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = nn;
            nn.prev = temp;
        }
    }

    public void insert_pos(int data, int pos) {
        Node nn = new Node(data);

        if (head == null) {
            head = nn;
        } 
        else if (pos == 0) {
            nn.next = head;
            head.prev = nn;
            head = nn;
        } 
        else {
            Node temp = head;

            for (int i = 0; i < pos - 1; i++) {
                temp = temp.next;
            }

            nn.next = temp.next;
            nn.prev = temp;

            if (temp.next != null) {
                temp.next.prev = nn;
            }

            temp.next = nn;
        }
    }

    public void delete_first() {
        if (head == null) {
            System.out.println("list is empty");
        } 
        else {
            head = head.next;

            if (head != null) {
                head.prev = null;
            }
        }
    }

    public void delete_last() {
        if (head == null) {
            System.out.println("list is empty");
        } 
        else if (head.next == null) {
            head = null;
        } 
        else {
            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.prev.next = null;
        }
    }

    public void delete_pos(int pos) {
        if (head == null) {
            System.out.println("list is empty");
        } 
        else if (pos == 0) {
            head = head.next;

            if (head != null) {
                head.prev = null;
            }
        } 
        else {
            Node temp = head;

            for (int i = 0; i < pos; i++) {
                temp = temp.next;
            }

            if (temp != null) {
                temp.prev.next = temp.next;

                if (temp.next != null) {
                    temp.next.prev = temp.prev;
                }
            }
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("list is empty");
        } 
        else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }

            System.out.println();
        }
    }
}

public class DLL {
    public static void main(String[] args) {

        Dll o = new Dll();

        o.insert_first(10);
        o.insert_first(20);
        o.insert_last(30);
        o.insert_pos(25, 2);

        o.display();

        o.delete_first();
        o.display();

        o.delete_last();
        o.display();

        o.delete_pos(1);
        o.display();
    }
}