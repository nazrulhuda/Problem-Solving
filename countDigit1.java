import java.util.*;
public class countDigit1 {
    public static void main(String[]args){
        int N=22233222;
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
