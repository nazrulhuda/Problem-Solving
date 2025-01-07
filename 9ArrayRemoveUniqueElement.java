// Remove Unique element by two pointer


import java.util.*;
public class ArrayRemoveUniqueElement{
public static void main(String[]args){
    int arr[]={1,1,2,2,3,3,3,3,3,4,4,4,4,9};
    int limit=optimal(arr);
    for(int i=0; i<limit;i++){
        System.out.println(arr[i]);
    }
    
}
public static int optimal(int[] digi){
    int i=0;
    for(int j=1; j<digi.length;j++){
        if(digi[j]!=digi[i]){
            i++;
           digi[i]=digi[j];
           
           
        }

       
       
    }
    
    return i+1;
 
  
}
}