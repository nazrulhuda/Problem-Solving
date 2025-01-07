// find the largest number in an array


import java.util.*;
public class ArrayLargest{
public static void main(String[]args){
    int arr[]={12,5,21,14};
    int maxDigit=optimal(arr);
    System.out.println(maxDigit);
    
}
public static int optimal(int[] digi){
    int max=0;
   
    for(int i=0; i<digi.length;i++){
        if(digi[i]>max){
            max=digi[i];
           
        }

       
    }
    
    return max;
 
  
}
}