import java.util.*;

class Map1{
    // public static void main(String args[]){
    //     Map<Character, Integer> mp = new HashMap<>();
    //     mp.put('a' , 1);
    //     mp.put('b' , 5);
    //     mp.put('d' , 6);
    //     mp.put('j' , 3);
    //     mp.put('s' , 7);
    //     System.out.println(mp.get('a'));
    //     System.out.println(mp);
    //     System.out.println(mp.get('c'));
    //     System.out.println(mp.getOrDefault('k' , 0));
    //     System.out.println(mp.getOrDefault('s' , 0));
    //     System.out.println(mp.keySet());
    // }
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            Map<Character,Integer> mp = new HashMap<>();
            String str=sc.nextLine();
            for(int i=0;i<str.length();i++){
              char key= str.charAt(i);
              int value = mp.getOrDefault(key,0)+1;
              mp.put(key,value);
         }
         System.out.println(mp);
    }

}