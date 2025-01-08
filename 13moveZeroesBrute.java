// move zeroes to the end
import java.util.*;
public class moveZeroesBrute{
public static void main(String[]args){
    int arr[]={25,0,23,0,12,0,0,1,4};
    int j=0;
    for (int i=0;i<arr.length;i++){
        if(arr[i]!=0){
            arr[i]=arr[j];
            j++;
        }
       
    }
    for(int i=j; i<arr.length;i++){
        arr[i]=0;
    }
  

    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]);
    }
    
    
}
  

}