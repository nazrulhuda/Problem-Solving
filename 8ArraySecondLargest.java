// find the second largest number in an array


import java.util.*;
public class ArraySecondLargest{
public static void main(String[]args){
    int arr[]={25,24,23,22,12,25,21,14,5,20};
    int maxDigit=optimal(arr);
    System.out.println(maxDigit);
    
}
public static int optimal(int[] digi){
    int max=-1;
    int secondLargest=-1;
    for(int i=0; i<digi.length;i++){
        if(digi[i]>max){
            max=digi[i];
   

           
        }
        if(digi[i]<max && digi[i]>secondLargest && digi[i]!=max){
            secondLargest=digi[i];
    
        }

       
    }
    
    return secondLargest;
 
  
}
}