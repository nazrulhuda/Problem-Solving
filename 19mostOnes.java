// This is for finding most 1s


import java.util.*;
public class mostOnes {
    public static void main(String[]args){
        int[] firstArr ={1, 1,1,1,1, 0, 1, 1, 1,1};
        int total=0;
        int max=0;
        for(int i=0; i<firstArr.length;i++){
            if(firstArr[i]==0){
                total=0;
            }
            else{
                total=total+1;
                if(total>max){
                    max=total;
                }
            }


        }
        

        System.out.println(max);

      
    

    }
}
