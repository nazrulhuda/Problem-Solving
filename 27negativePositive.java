// This is rearrangine positive negative


import java.util.*;
public class negativePositive  {
    public static void main(String[]args){
        int arr[] = {1,2,-4,-5};
        ArrayList<Integer> positive= new ArrayList<>();
        ArrayList<Integer> negative=new ArrayList<>();

        for(int i=0;i<arr.length;i++){
          if(arr[i]>0){
            positive.add(arr[i]);
          }
          else{
            negative.add(arr[i]);
          }
        }
        int i=0;
        int j=0;
        int k=0;
       System.out.println(i);
        while(j<positive.size() && k<negative.size()){
          arr[i++]=positive.get(j++);

          arr[i++]=negative.get(k++);
          
          
          
        }
        while(j<positive.size()){
          arr[i++]=positive.get(j);
          j++;

        }
        while(k<negative.size()){
          arr[i++]=negative.get(k);
          k++;
        }
        for(int p=0;p<arr.length;p++){
          System.out.print(arr[p]);
        }
        
       
    }}
