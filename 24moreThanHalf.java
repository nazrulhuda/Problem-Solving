// This is for finding if an element exists n>2


import java.util.*;
public class moreThanHalf  {
    public static void main(String[]args){
        int[] firstArr ={0, 2, 1, 2, 2, 2};
        int remember=firstArr[0];
        int count=1;
        for(int i=1;i<firstArr.length;i++){
            if(firstArr[i]==remember){
                count++;
                System.out.println(remember+"------ " +count);
            }
            if(firstArr[i]!=remember){
                count--;
                if(count<=0){
                    remember=firstArr[i];
                    count=1;
                    System.out.println(remember+"------ " +count);
                }
                

            }
          }
          System.out.println(count);
          if(count>0){
            System.out.println(remember);
          }
       
    }}
