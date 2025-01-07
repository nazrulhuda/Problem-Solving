// Finding the greatest common divisor


import java.util.*;
public class gcd{
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n1=sc.nextInt();
    int n2=sc.nextInt();
    int divisors=optimal(n1,n2);
    System.out.println(divisors);
    
}
public static int optimal(int k, int p){
    int min=(int)Math.min(k,p);
   
    int largestDivisor=0;
    for(int i=1; i<=min;i++){
        if(k%i==0 && p%i==0 && i>largestDivisor){
            largestDivisor=i;
           
        }

       
    }
    
    return largestDivisor;
 
  
}
}