// This is for counting digits. we can count digit by dividing my 10. For optimal approach we can use log10 approach.


import java.util.*;
public class BasicCountDigit1 {
    public static void main(String[]args){
        int N=2223322;
        int digit=optimal(N);
        System.out.println(digit);
    }

    public static int brute(int k){
        int count=0;
        while(k>0){
            k=k/10;
            count++;
        }
        return count;
    }

    public static int optimal(int k){
        int count=(int)(Math.log10(k)+1);
        return count;
    }
}
