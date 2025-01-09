// This is for union for two sorted arrays


import java.util.*;
public class unionBrute {
    public static void main(String[]args){
        int[] firstArr ={1,2,3,4,5,6};
        int[] secondArr ={0,3,4,7,8,9};


        HashSet <Integer> hasing= new HashSet<>();
        for(int i=0;i<firstArr.length;i++){
           hasing.add(firstArr[i]);
        }
        for(int i=0;i<secondArr.length;i++){
            hasing.add(secondArr[i]);
         }

         ArrayList <Integer> union = new ArrayList<>();

        for(int it:hasing){
            union.add(it);}

        

        for(int i=0; i<union.size();i++){
            System.out.print(union.get(i));
        }

         
         
    }

    
}
