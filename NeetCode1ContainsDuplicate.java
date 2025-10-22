import java.util.*;

public class NeetCode1ContainsDuplicate {
    public static void main(String[]args){
     int[] nums={1,2,3,1};
     System.out.println(optimize2containsDuplicate(nums));
    
   
    }

    public static boolean brute1containsDuplicate(int[] nums){

        for (int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;

    }

    public static boolean brute2containsDuplicate(int[] nums){
        Arrays.sort(nums);
        for (int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }   
        }
        return false;

    }
    public static boolean optimize1containsDuplicate(int[] nums){
        Set<Integer> set=new HashSet<>();
        for(int i:nums){
            if(set.contains(i)){
                return true;
            }
            set.add(i);
        }
        return false;
    }

    public static boolean optimize2containsDuplicate(int[] nums){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i, 0)+1);
            if(map.get(i)>1){
                return true;
            }
        }
        return false;

    }

    
}

 
  


