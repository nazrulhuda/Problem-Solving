// Remove Unique element by two pointer


import java.util.*;
public class ArrayLeftRoateOne{
public static void main(String[]args){
    int arr[]={1,2,3,4};
    optimal(arr);
    for(int i=0; i<arr.length;i++){
       System.out.println(arr[i]);
    }
    
}
public static void optimal(int[] digi){
    int first=digi[0];
    for(int i=1;i<digi.length;i++){
        digi[i-1]=digi[i];
    }
    digi[digi.length-1]=first;
  
}
}