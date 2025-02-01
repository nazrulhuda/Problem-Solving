// This is the brute force for finding the highest sum


import java.util.*;
public class maxSum  {
    public static void main(String[]args){
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int max=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i+1;j<arr.length;j++){
                sum=sum+arr[j];
                if(sum>max){
                    max=sum;
                }
            }
        }
        System.out.println(max);
        
       
    }}
