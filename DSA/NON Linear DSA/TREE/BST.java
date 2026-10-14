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
    
    Node insert(Node root, int data) {
        if (root == null) {
            return new  Node(data);
        }
        else {
            if (data > root.data) {
                root.right = insert(root.right, data);
            }
            else {
                root.left = insert(root.left, data);
            }
        }
        return root;
    }
    
    
}


public class BST {
    public static void main(String[] args) {
        Bt b = new Bt();
        b.root = b.insert(b.root,10);
        b.insert(b.root,50);
        b.insert(b.root,30);
        b.insert(b.root, 5);
        b.insert(b.root, 100);
        b.insert(b.root, 40);
        b.pre_order(b.root);
        System.out.println();
        b.in_order(b.root);
        System.out.println();
        b.post_order(b.root);
        System.out.println();
    }
}