import java.util.*;
class SumOfElements{
    public static void main(String args[]){
        int n,sum=0;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for( int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println("Sum:"+sum);
    }
}