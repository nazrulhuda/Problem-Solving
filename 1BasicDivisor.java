// Finding all the divisors. sqrt is enough to find the divisors. but so that 6*6 like that dont appear twice we include one if. 


import java.util.*;
public class BasicDivisor{
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    
    List<Integer> listing=optimal(n);

    for(int counting: listing){
        System.out.println(counting);
    }
    
}
public static List<Integer> optimal(int k){
    List<Integer> list=new ArrayList<>();
    int n=(int)Math.sqrt(k);
    for(int i=1; i<=n;i++){
        if(k%i==0){
            list.add(i);
            if(i!=k/i){
                list.add(k/i);
            }
        }

       
    }
    return list;
 
  
}
public static List<Integer> brute(int k){
    List<Integer> list=new ArrayList<>();
    for(int i=1; i<=k;i++){
        if(k%i==0){
            list.add(i);
        }

       
    }
    return list;
 
  
}}