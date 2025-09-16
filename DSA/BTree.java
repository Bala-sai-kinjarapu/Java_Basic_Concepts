class Node{
    int data;
    Node left,right;    
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
class BTree{
    static Node root = null;
    static Node insert(Node root , int val){
        if(root == null){
            Node newNode = new Node(val);
            return newNode;
        }
        if(root.data > val){
            root.left = insert(root.left , val);
        }
        else{
            root.right = insert(root.right , val);
        }
        return root;
    }
    static void postOrder(Node root){
        if(root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data +"  ");
        }
    }
    static void preOrder(Node root){
        if(root != null){
            System.out.print(root.data +" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    static void inOrder(Node root){
        if(root != null){
            inOrder(root.left);
            System.out.print(root.data +" ");
            inOrder(root.right);
        }
    }
    static Node findMin(Node root){
        if(root == null){
            System.out.println("Tree is empty");
            return -1;
        }
        Node temp = root;
        while(temp.left != null){
            temp = temp.left;
        }
        return temp;

    }
    static void find(Node root,int key){
        if(root == null){
            System.out.println(key+" is not found");
            return;
        }
        if(key < root.data){
            find(root.left,key);
        }
        else if(key > root.data){
            find(root.right,key);
        }
        else if(key == root.data){
            System.out.println(root.data +" is found");
        
        }
    }
    static Node delete(Node root, int key){
        if(root == null){
            System.out.println("Tree is empty");
            return;
        }
        if(root.data > key){
            root.left = delete(root.left , key);
        }
        else if(key > root.data){
            root.right = delete(root.right , key);
        }
        else if(root.data == key){
            if(root.left == null && root.right == null){
                return null;
            }
            else if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            else{
                Node minNode = findMin(root.right);
                minNode.right=root.right;
                root.right = minNode;
                

            }
        }
    }
    public static void main(String args[]){
        root = insert(root , 10);
        root = insert(root , 5);
        root = insert(root , 7);
        root = insert(root , 15);
        root = insert(root , 12);
        root = insert(root , 17);
        inOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        find(root , 11);
    }
}