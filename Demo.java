import java.util.*;
import java.lang.*;
class Demo{
    
    public static void main(String args[]){
        String str="I am learning java programming";
        String arr[];
        arr=str.split(" ");
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[arr.length-i-1]+" ");
            
        }
        System.out.print(arr[0]);
        
    }
}