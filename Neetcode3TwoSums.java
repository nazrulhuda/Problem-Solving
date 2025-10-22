
import java.util.*;

public class Neetcode3TwoSums {
    public static void main(String[]args){
     int[] a= {3,5,6,4};
     int p=7;


     int[] h=optimized1TwoSUms(a,p);
     for(int i=0;i<h.length;i++){
      System.err.print(h[i]);
     }

    
   
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

    public static int[] optimized1TwoSUms(int[] c,int t){
      Map<Integer,Integer> map= new HashMap<>();

      for(int i=0;i<c.length;i++){
         if(map.containsKey(t-c[i])){
             return new int[] {map.get(t-c[i]),i};
            
         }
         map.put(c[i],i);
      }
      return new int[] {};
      

      
       
     
      

    }




    
}
