// This is for intersection for two sorted arrays


import java.util.*;
public class arrayIntersection {
    public static void main(String[]args){
        int[] firstArr ={0,0,0,1,2,8,9};
        int[] secondArr ={0,0,1,8,9};
    int i=0;
    int j=0;
    List<Integer> union=new ArrayList<>();
     while(i<firstArr.length && j<secondArr.length){
         if(firstArr[i]<secondArr[j]){
            
            i++;

         }
         else if(firstArr[i]>secondArr[j]){
            j++;
            
         }
         else{
            if(union.isEmpty() || union.get(union.size()-1)!=secondArr[j]){
           union.add(secondArr[j]);
            }
           i++;
           j++;
          
         }
     }
     


    for(int x=0; x<union.size();x++){
        System.out.println(union.get(x));
    }
         
    }

    
}
