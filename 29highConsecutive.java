// This is for finding leaders where the are biggest on their right sides


import java.util.*;
public class highConsecutive  {
    public static void main(String[]args){
        int arr[] =  {100, 200, 1, 3, 2, 4,5,9,8,7,6};
        HashMap<Integer,Integer> map=new HashMap<>();
        
        int max=1;
   
        for(int i:arr){
          map.put(i,map.getOrDefault(map, 0)+1);
         
        }
        for(int i:arr){
          int count=1;
          int number=i+1;
          while(map.containsKey(number)){
            count++;
            number++;
            if(count>max){
              max=count;
            }

          }

        }
        System.out.println(max);

       
        





       

       
    }}
