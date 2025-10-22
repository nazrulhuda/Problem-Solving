
import java.util.*;

public class Neetcode2Anagrams {
    public static void main(String[]args){
     String r= "racecar";
     String p="carrace";


     System.out.println(optimize1Anagrams(r,p));
    
   
    }

    public static boolean brute1Anagrams(String r,String p){
      
       char[] r1=r.toCharArray();
       char[] p1=p.toCharArray();
       Arrays.sort(r1);
       Arrays.sort(p1);
       return Arrays.equals(r1, p1);  
     
      

    }

    public static boolean optimize1Anagrams(String r,String p){
       
       
       HashMap<Character,Integer> map1=new HashMap<>(); 
       HashMap<Character,Integer> map2=new HashMap<>();

     
      
       for(char i: r.toCharArray()){
        map1.put(i,map1.getOrDefault(i, 0)+1);
        System.err.println(map1);
       }
       for(char i: p.toCharArray()){
        map2.put(i,map2.getOrDefault(i, 0)+1);
        System.err.println(map2);
       }
       return map1.equals(map2);
     
      

    }



    
}
