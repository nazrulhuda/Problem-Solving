// Finding all the prime


import java.util.*;
public class 5PrimeNumber{
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int t=optimal(n);
    if(t==2){
        System.out.println("Prime");
    }else{
        System.out.println("not prime");
    }
    
}
public static int optimal(int k){
    int n=(int)Math.sqrt(k);
    int count=0;
    for(int i=1; i<=n;i++){
        if(k%i==0){
            count++;
            if(i!=k/i){
                count++;
            }
        }

       
    }
    System.out.println(count);
    return count;
 
  
}
}