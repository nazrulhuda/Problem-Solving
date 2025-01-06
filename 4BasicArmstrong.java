// This if for armstrong number. 371 where length is 3, is a armstrong number cause 3^3 + 7^3+1^3 is == 371 


import java.util.*;
public class BasicArmstrong4 {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if (optimal(n)){
       System.out.println("armstrong");
    }else{
        System.out.println("not armstrong");
    }
    
}
public static boolean optimal(int k){
    int digits = String.valueOf(k).length();
    int normal=k;
    int answer=0;
    while(k>0){
        int digit=k%10;
        answer=answer+(int)Math.pow(digit, digits); 
        k=k/10;

    }
        return normal==answer;
 
  
}}