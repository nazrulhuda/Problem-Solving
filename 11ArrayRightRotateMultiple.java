// Rotate element by right


import java.util.*;
public class 11ArrayRightRotateMultiple{
public static void main(String[]args){
    int arr[]={1,2,3,4,5,6,7};
    int d=3;
    int rotate=d%arr.length;
    
    int[] temp=new int[rotate];
    for (int i=0; i<temp.length;i++){
        temp[i]=arr[i+arr.length-d];
       
    }
    

    for(int i=arr.length-1; i>arr.length-rotate-2;i--){
    
       arr[i]=arr[i-rotate];
       
       
    }

     for(int i=0; i<temp.length;i++){
        arr[i]=temp[i];
      
    
     }
     for(int i=0; i<arr.length;i++){
       System.out.println(arr[i]);
     }
    
}

}