// This is for finding maxsubarray optimal


import java.util.*;
public class maxSubArray2 {
    public static void main(String[]args){
        int[] firstArr ={1,2,1,1,2,1,1};
       
        int k=4;
        int count=0;
        int max=0;
        
        for(int i=0;i<firstArr.length; i++){
            int sum=0;
            for (int j=i; j<firstArr.length;j++){
                sum=sum+firstArr[j];
                if(sum==k){
                 count=j-i+1;
                 if (count>max){
                    max=count;
                 }
                }
            }
         
           
        
        
        }
        
        System.out.println(max);
        

  

      
    

    }
}
