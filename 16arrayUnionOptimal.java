// This is for union for two sorted arrays


import java.util.*;
public class arrayUnionOptimal {
    public static void main(String[]args){
        int[] firstArr ={3,4,5,6};
        int[] secondArr ={0,3,4,7,8,9};
    int i=0;
    int j=0;
    List<Integer> union=new ArrayList<>();
     while(i<firstArr.length && j<secondArr.length){
         if(firstArr[i]<secondArr[j]){
            if(union.get(union.size()-1)!=firstArr[i] || union.isEmpty()){
                union.add(firstArr[i]);
            }
            
            i++;

         }
         else if(firstArr[i]>secondArr[j]){
            if( union.isEmpty() || union.get(union.size()-1)!=secondArr[j] ){
            union.add(secondArr[j]);
            }
            j++;
            
         }
         else{
            if(union.get(union.size()-1)!=secondArr[j] || union.isEmpty()){
           union.add(secondArr[j]);
            }
           i++;
           j++;
          
         }
     }
     

     while(i<firstArr.length){
           if(union.get(union.size()-1)!=firstArr[i] || union.isEmpty()){
               union.add(firstArr[i]);
           }
           System.out.println(union);
           i++;}

    while(j<secondArr.length){
            if(union.get(union.size()-1)!=secondArr[j] || union.isEmpty()){
                union.add(secondArr[j]);
            }
            System.out.println(union);
            j++;}


    for(int x=0; x<union.size();x++){
        System.out.println(union.get(x));
    }
         
    }

    
}
