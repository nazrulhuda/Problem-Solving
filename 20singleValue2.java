// This is for finding single value with ^


import java.util.*;
public class singleValue2 {
    public static void main(String[]args){
        int[] firstArr ={1,1,2,2,3,4,4,5,5};
        int calculate=0;
        for(int num: firstArr){
            calculate=calculate^num;
        }
        
        System.out.println(calculate);
        

  

      
    

    }
}
