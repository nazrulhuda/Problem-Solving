// This is the kadanes algorithm for finding the highest sum


import java.util.*;
public class stockBuySell  {
    public static void main(String[]args){
        int[] prices = {7, 1, 5, 3, 6, 4};
        int min=prices[0];
        int calculate=0;
        int max=0;
        for(int i=0; i<prices.length;i++){
          if(prices[i]<min){
            min=prices[i];
    
          }
          calculate=prices[i]-min;
          if(calculate>max){
            max=calculate;
          }



        }
        System.out.println(max);
        
       
    }}
