class Node{
    int data;
    Node next;
    Node(data){
        this.data=data;
        this.next = null;
    }
}
class QueueUsingLL{
    static Node front = null , rear = null;
    static void isEmpty(){
        return rear==null;
    }
    static void create(data){
        Node newNode = new Node(data);
        front=newNode;
        rear=newNode;
    }
    static void enQueue(data){
        if(isEmpty()){
            create(data);
            return;
        }
        Node newNode = new Node(data);
        rear.next=newNode;
        rear=newNode;
    }
    static void deQueue(){
        if(isEmpty()){
            
        }
    }
    public static void main(String args[]){

    }
}