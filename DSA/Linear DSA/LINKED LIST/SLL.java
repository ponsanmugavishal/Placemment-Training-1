import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node (int data) {
        this.data = data;
        this.next = null;
    }
}

class Sll {
    Node head;
    public void insert_first(int data){
        Node nn = new Node(data);
        if (head == null) {
            head  =  nn;
            return;
        }
        else {
            nn.next = head;
            head = nn;
        }
    }

    public void insert_last(int data) {
        Node nn = new Node(data);
        if ( head == null) {
            head = nn;
        }
        else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = nn;
        }
    }

    public void insert_pos (int data , int pos) {
        Node nn = new Node(data);
        if (head == null) {
            head = nn;
        }
        else if (pos == 0) {
            nn.next = head;
            head = nn;
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
        else {
            head = head.next;
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
            while(temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    public void delete_pos(int pos) {
        if (head == null) {
            System.out.println("list is empty");
        }
        else if (pos == 0) {
            head = head.next;
        }
        else {
            Node temp = head;
            for (int i = 1; i < pos -1; i++) {
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
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        System.out.println();
    }
}

public class SLL {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            Sll sll = new Sll();
            System.out.println("1. Insert First");
            System.out.println("2. Insert Last");
            System.out.println("3. Insert Position");
            System.out.println("4. Delete First");
            System.out.println("5. Delete Last");
            System.out.println("6. Delete Position");
            System.out.println("7. Display");
            System.out.println("8. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter data: ");
                    int data1 = sc.nextInt();
                    sll.insert_first(data1);
                    break;
                case 2:
                    System.out.print("Enter data: ");
                    int data2 = sc.nextInt();
                    sll.insert_last(data2);
                    break;
                case 3:
                    System.out.print("Enter data: ");
                    int data3 = sc.nextInt();
                    System.out.print("Enter position: ");
                    int pos3 = sc.nextInt();
                    sll.insert_pos(data3, pos3);
                    break;
                case 4:
                    sll.delete_first();
                    break;
                case 5:
                    sll.delete_last();
                    break;
                case 6:
                    System.out.print("Enter position: ");
                    int pos6 = sc.nextInt();
                    sll.delete_pos(pos6);
                    break;
                case 7:
                    sll.display();
                    break;
                case 8:
                    System.exit(0);
                    sc.close();
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}