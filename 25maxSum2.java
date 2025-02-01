// This is the kadanes algorithm for finding the highest sum


import java.util.*;
public class maxSum2  {
    public static void main(String[]args){
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int max=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
         sum=sum+arr[i];
         if(sum<0){
            sum=0;
         }
         else if(sum>max){
            max=sum;
         }
        }
        System.out.println(max);
        
       
    }}
