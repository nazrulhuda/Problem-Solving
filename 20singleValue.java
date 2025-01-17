// This is for finding single digit with hashmap


import java.util.*;
public class singleValue {
    public static void main(String[]args){
        int[] firstArr ={1,1,2,2,3,4,4,5,5};
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int value:firstArr){
            map.put(value, map.getOrDefault(value, 0)+1);

        }
        for(int num: map.keySet()){
            if(map.get(num)==1){
                System.err.println(num);
            }
        }
        
        

  

      
    

    }
}
