// This is for finding single value with ^. 1^1=0


import java.util.*;
public class maxSubArray {
    public static void main(String[]args){
        int[] firstArr ={1,2,2,1,1,2};
        HashMap<Integer,Integer> map=new HashMap<>();
        int k=4;
        int sum=0;
        int max=0;
        
        for(int i=0;i<firstArr.length; i++){
            sum=sum+ firstArr[i];
            if(sum==k){
                if(i+1>max){
                    max=i+1;
                }
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        
            int count=sum-k;
            if(map.containsKey(count)){
                if(i-map.get(count)>max){
                    max=i-map.get(count);

                }


            }
        }
        
        System.out.println(max);
        

  

      
    

    }
}
