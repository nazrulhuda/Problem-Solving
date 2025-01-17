// This is for finding missing number with ^. 1^1 gives 0, and 3^3^4 gives 4. so we can find the reminder


import java.util.*;
public class missingNumber2 {
    public static void main(String[]args){
        int[] firstArr ={1,2,3,5};
        int input=0;
        int total=0;
        for(int i=0; i<firstArr.length;i++){
            input=input ^ firstArr[i];
            total=total^(i+1);


        }
        total=total^firstArr.length+1;

        System.out.println(input^total);

      
    

    }
}
