import java.util.*;
class StackAndQueue{
    public static void main(String args[]){
        // Stack<Integer> st=new Stack<>();
        // st.push(10);
        // st.push(20);
        // st.push(30);
        // st.push(40);
        // System.out.println(st);

        // System.out.println(st.peek());
        // st.pop();
        // System.out.println(st);

        // System.out.println(st.peek());



        // Queue<Integer> que = new LinkedList<>();
        // que.offer(8);
        // que.offer(18);
        // que.offer(28);
        // que.offer(38);
        // que.offer(48);
        // System.out.println(que);
        // System.out.println(que.peek());
        // que.poll();
        // System.out.println(que);
        // System.out.println(que.peek());


        Queue<Integer> qu=new PriorityQueue<>();//we can paa the " Collections.reverseOrder() " 
        qu.offer(25);                           //to r  qwAESDQCGY97everse the default priority.
        qu.offer(45);
        qu.offer(15);
        qu.offer(2);
        qu.offer(23);
        System.out.println(qu);
        System.out.println(qu.peek());
        qu.poll();
        System.out.println(qu);
        System.out.println(qu.peek());



    }
}