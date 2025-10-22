
import java.util.*;

public class Neetcode4GroupAnagrams {
    public static void main(String[]args){
     String[] a= {"eat","tea","tan","ate","nat","bat"};
     


     List<List<String>> h=optimized1TwoSUms(a);

    System.out.print(h);
    
   
    }

    public static int[] bruteTwoSUms(int[] c,int t){
      for(int i=0;i<c.length;i++){
         for(int j=i+1;j<c.length;j++){
            if(c[i]+c[j]==t){
              
               return new int[] {i,j};
            }
         }
      }
      return new int[] {};
       
     
      

    }

    public static List<List<String>> optimized1TwoSUms(String[] t){
      Map<String,List<String>> map= new HashMap<String,List<String>>();

      for(String d: t){
        char[] a=d.toCharArray();

        Arrays.sort(a);

        String b=new String(a);

        if(map.containsKey(b)){
         List<String> existing=map.get(b);
         existing.add(d); 
        }
        else{
         List<String> firstList=new ArrayList<String>();
         firstList.add(d);
         map.put(b,firstList);
        }
      }
      List<List<String>> returning=new ArrayList<List<String>>();
      for(String key:map.keySet()){
        returning.add(map.get(key));

      }
      return returning;


      
      

      
       
     
      

    }




    
}
