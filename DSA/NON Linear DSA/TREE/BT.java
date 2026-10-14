class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        this.left = null;
        this.right=  null;
    }
}

class Bt {
    Node root;
    
    void pre_order(Node root ) {
        if(root != null) {
            System.out.print(root.data + " ");
            pre_order(root.left);
            pre_order(root.right);
        }
    }
    

    void in_order(Node root) {
        if(root != null) {
            in_order(root.left);
            System.out.print(root.data + " ");
            in_order(root.right);  
        }
    }

    void post_order(Node root) {
        if(root != null) {
            post_order(root.left);
            post_order(root.right);
            System.out.print(root.data + " ");
        }
    }
    
}


public class BT {
    public static void main(String[] args) {
        Bt b = new Bt();
        b.root = new Node(1);
        b.root.left = new Node(2);
        b.root.right = new Node(3);
        b.root.left.left = new Node(4);
        b.root.left.right = new Node(5);
        b.root.right.left = new Node(6);
        b.root.right.right = new Node(7);
        b.pre_order(b.root);
        System.out.println();
        b.in_order(b.root);
        System.out.println();
        b.post_order(b.root);
        System.out.println();
    }
}







