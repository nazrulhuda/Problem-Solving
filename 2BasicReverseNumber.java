// This is for reversing a number


import java.util.*;
public class BasicReverseNumber2 {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int reversed=optimal(n);
    System.out.println(reversed);
}
public static int optimal(int k){
    int answer=0;
    while(k>0){
        int digit=k%10;
        answer=answer*10+digit;
        k=k/10;

    }
    return answer;
}}