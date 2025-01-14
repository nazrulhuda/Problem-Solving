// left rotate using temp


import java.util.*;
public class ArrayLeftRotateMultiple{
public static void main(String[]args){
    int arr[]={1,2,3,4,5,6,7};
    int d=3;
    int rotate=d%arr.length;
    int a=arr.length;

    reverse(0,d-1,arr);
    reverse(d, a-1, arr);
    reverse (0,a-1, arr);

    for(int i=0; i<arr.length;i++){
        System.out.print(arr[i]);
    }}

public static void reverse(int start, int end, int[] arra){
    int temp=0;
    while(start<end){
        temp=arra[start];
        arra[start]=arra[end];
        arra[end]=temp;
        end--;
        start++;

    }
}
  
}

