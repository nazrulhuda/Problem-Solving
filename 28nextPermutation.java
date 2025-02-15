// This is next permutation


import java.util.*;
public class nextPermutation  {
    public static void main(String[]args){
        int arr[] =  {2,3,1};
        int index=-1;
        for(int i=arr.length-1; i>=1;i--){
          if(arr[i]>arr[i-1]){
            index=i-1;
            break;
          }

        }

       
        int threshhold=index+1;
        for(int i=index+1; i<arr.length;i++ ){

          if(arr[i]>arr[index]&& arr[i]<arr[threshhold]){
            threshhold=i;

          }
        }
        int temp=arr[index];
        arr[index]=arr[threshhold];
        arr[threshhold]=temp;

        int start=index+1;
        int end=arr.length-1;
        while(start<end){
          int temp1=arr[start];
          arr[start]=arr[end];
          arr[end]=temp1;
          start++;
          end--;

        }


        for(int i=0;i<arr.length;i++){
          System.out.print(arr[i]);
        }



       

       
    }}
