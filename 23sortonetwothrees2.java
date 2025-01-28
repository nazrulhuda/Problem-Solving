// This is for sorting 0's 1's and 2's


import java.util.*;
public class sortonetwothrees2  {
    public static void main(String[]args){
        int[] firstArr ={0, 2, 1, 2, 0, 1};
        int low=0;
        int mid=0;
        int high=firstArr.length-1;
       while(mid<=high){
        switch(firstArr[mid]){
            case 0:
                int temp=firstArr[low];
                firstArr[low] = firstArr[mid];
                firstArr[mid] = temp;
                low++;
                mid++;
                break;

            case 1:
                mid++;
                break;

            case 2:
                int temp1=firstArr[high];
                firstArr[high] = firstArr[mid];
                firstArr[mid] = temp1;
               
                high--;
                break;
          
        }
       }
       for(int i=0;i<firstArr.length;i++){
         System.out.print(firstArr[i]);
       }
    }}
