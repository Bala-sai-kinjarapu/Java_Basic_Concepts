import java.util.*;
class CollectDemo{
    public static void main(String args[]){
        int []arr1=new int[100];
        int []arr2=new int[100];
        Scanner sc= new Scanner(System.in);
        int i=0;
        while(sc.hasNextInt()){
            arr1[i++]=sc.nextInt();
        }
        sc.nextLine();
        int j=0;
        while(sc.hasNextInt()){
            arr2[j++]=sc.nextInt();
        }
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int it=0;it<i;it++){
            set1.add(arr1[it]);
        }
        for(int jt=0;jt<j;jt++){
            set2.add(arr2[jt]);
        }
        
        Set<Integer>temp= new HashSet<>();
        for(int num:set1)
            temp.add(num);
        temp.addAll(set2);
        set1.retainAll(set2);
        System.out.println(temp);
        System.out.println(set1);
        
    }
}