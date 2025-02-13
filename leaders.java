// This is next permutation


import java.util.*;
public class leaders  {
    public static void main(String[]args){
        int arr[] = {4, 7, 1, 0};
        int max=arr[arr.length-1];
        System.out.print(max);
        for(int i=arr.length-2; i>=0;i--){
          if(arr[i]>max){
            max=arr[i];
            System.out.print(max);
          }

        }

       
        





       

       
    }}
