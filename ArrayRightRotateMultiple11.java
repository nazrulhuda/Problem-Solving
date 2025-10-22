// Rotate element by right


import java.util.*;
public class ArrayRightRotateMultiple11{
public static void main(String[]args){
    int arr[]={1,2,3,4,5,6,7};
    int d=5;
    int rotate=d%arr.length;
    
    int[] temp=new int[arr.length];
    int k=0;
    for(int i=arr.length-d;i<arr.length;i++){
      temp[k]=arr[i];
      k++;
    }
    int p=0;
    for (int i=k;i<arr.length;i++){
      temp[i]=arr[p];
      
      p++;
    }
    for(int i=0;i<arr.length;i++){
      System.out.print(temp[i]);
    }
   
    
    
}

}