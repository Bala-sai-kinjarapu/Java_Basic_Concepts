import java.util.*;

class Collections{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        while(sc.hasNextInt())
            set1.add(sc.nextInt());
        sc.nextLine();
        while(sc.hasNextInt())
            set2.add(sc.nextInt());
        System.out.println(set1);
        System.out.println(set2);

        // set1.addAll(set2);
        // System.out.println(set1);
        set1.retainAll(set2);
        System.out.println(set1);

    }
}