    import java.util.*;
    import java.lang.*;
    import java.io.*;
    
    // The main method must be in a class named "Main".
    public class TwoSumsLTC {
      
    
    public static void main(String[] args) {
                //0,1,2,3,4,5,6,7,8,9,10
    int[] arr = {2,7,11,15,17,19};
     int target = 32;
    int[] val = twoSum(arr,target);
    System.out.println(Arrays.toString(val));

    }
    
    // bruce force method
    static int[] twoSum(int[] nums, int target) {
        
        
      int[] val = new int[2];
        
      
      for (int i=0;i<nums.length-1;i++){
        
        for(int j=i+1;j<=nums.length-1;j++){
          
          
          if(nums[i]+nums[j]==target){
            
            val[0] = i;
            val[1] = j;
          }
        }
      } 
      
      return val;
    }
    
    }
