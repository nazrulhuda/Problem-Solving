// This is for sorting 0's 1's and 2's


import java.util.*;
public class sortonetwothrees  {
    public static void main(String[]args){
        int[] firstArr ={0, 2, 1, 2, 0, 1};
        int zero=0;
        int one=0;
        int two=0;
        for(int i=0;i<firstArr.length; i++){
            if(firstArr[i]==0){
                zero++;
            }
            if(firstArr[i]==1){
                one++;
            }
            if(firstArr[i]==2){
                two++;
            }
        }
        for(int i=0; i<zero;i++){
            firstArr[i]=0;
           
        }
        for(int i=zero; i<one+two;i++){
            firstArr[i]=1;
           
        }
        for(int i=one+two; i<firstArr.length;i++){
            firstArr[i]=2;
           System.out.println();
        }

        for(int i=0; i<firstArr.length;i++){
            System.out.print(firstArr[i]);
        }
        
    }}
