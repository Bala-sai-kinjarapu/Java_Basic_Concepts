import java.util.*;
class Thread1 extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            try{
            System.out.println("hello!");
                Thread.sleep(10);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
class Thread2 extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
        try{
            System.out.println("hiiieee!");

           Thread.sleep(10);
        }
        catch(Exception e){
            System.out.println(e);
        }
        }
    }
}
class Threading{
    public static void main(String args[]){
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    }
}