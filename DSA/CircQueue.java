
class CircQueue{
    static int que[],front, rear,size;
    CircQueue(int cap){
        que = new int[cap];
        front = 0;
        rear = -1 ;
        size = cap;
    }
    static boolean isFull(){
        if((rear == size-1 && front == 0) || (rear == front-1 && rear !=-1)){
            return true;
        }
        return false;
    }
    static boolean isEmpty(){
        if((rear == -1) || (front>rear && que[size-1]==-1)){
            return true;
        }
        return false;
    }
    static void enQueue(int data){
        if(isFull()){
            System.out.println("Queue overflow");
            return;
        }
        if(rear == size-1){
            rear = 0;
            que[rear] = data;
        }
        else{
            rear++;
            que[rear]=data;
        }
    }
    static void deQueue(){
        if(isEmpty()){
            System.out.println("Queue underflow");
            return;
        }
        if(front == rear){
            que[front] = -1;
            front = 0;
            rear = -1;
        }
        else if(front == size-1){
            que[front] = -1;
            front = 0;
        }
        else{
            que[front] = -1;
            front++;
        }
    }
    static void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        if(front>rear){
            for(int i= front;i<=size-1;i++){
                System.out.print(que[i] +" ");
            }
            for(int i=0;i<=rear;i++){
                System.out.print(que[i] +" ");
            }
        }
        else{
            for(int i=front;i<=rear;i++){
                System.out.print(que[i] +" ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        CircQueue cq = new CircQueue(4);
        enQueue(20);
        display();
        enQueue(30);
        display();
        enQueue(10);
        display();
        enQueue(50);
        display();
        enQueue(50);//1
        display();
        deQueue();
        display();
        deQueue();
        display();
        enQueue(190);
        display();
        enQueue(170);
        display();
        enQueue(150);
        display();
        deQueue();
        display();
    }
}