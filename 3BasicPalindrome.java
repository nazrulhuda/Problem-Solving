// This if for checking palindrome. Means the digits will be same if the are reversed


import java.util.*;
public class BasicPalindrome {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if (optimal(n)){
       System.out.println("palindrome");
    }else{
        System.out.println("not palindrome");
    }
    
}
public static boolean optimal(int k){
    int normal=k;
    int answer=0;
    while(k>0){
        int digit=k%10;
        answer=answer*10+digit;
        k=k/10;

    }
    if (normal==answer){
        return true;
    } else{return false;}
  
}}