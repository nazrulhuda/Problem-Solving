// move zeroes to the end
import java.util.*;
public class movedZeroes{
public static void main(String[]args){
    int arr[]={25,0,23,0,12,0,0,1,4,0,0};
    int j=arr.length-1;
    for (int i=0;i<j;i++){
        if(arr[i]==0){
            while(arr[j]==0 && j>i){
                j--;}
                arr[i]=arr[j];
                arr[j]=0;         
        }
       
    }

for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]);
}

   
}
    
}
  

