import java.util.*;
import java.lang.*;
class Freequency{
    public static void main(String args[]){
        String str="javaprogramming";
        int arr[]=new int[26];
        int max=0;
        char fch=' ';
        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)-'a']++;
        }
        //for(int i=0;i<26;i++)
        for(int j=0;j<str.length();j++)
        {
            int i = str.charAt(j)-'a';
            if(arr[i]>0){
                //char ch=(char)(i+'a');  
                System.out.println(str.charAt(j)+":"+ arr[i]);
                arr[i]=0;
            }
            if(arr[j]>max){
                max=arr[j];
                fch=(char)(j+'a');
            }
        }
        System.out.println("most freequent charecter is: "+ fch + ":" +max);
    }
}