// This is for making two sum with optimal Hashmap


import java.util.*;
public class  {
    public static void main(String[]args){
        int[] firstArr ={7, 11, 15, 2};
        int k=9;
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i=0;i<firstArr.length;i++){
            int complement=k-firstArr[i];
            if(map.containsKey(complement)){
                System.out.println(i+" "+map.get(complement));
                break;
            }
            map.put(firstArr[i],i);
        }
        
    }}
