// This is for findin missing number by using sum equation of n*(n+1)/2


import java.util.*;
public class missingNumber {
    public static void main(String[]args){
        int[] firstArr ={1,2,3,5};
        int sum=0;
        int n=firstArr.length+1;
        int a=(n*(n+1))/2;
        for(int i=0; i<firstArr.length;i++){
            sum=sum+firstArr[i];

        }

        System.out.println(a-sum);

      
    

    }
}
