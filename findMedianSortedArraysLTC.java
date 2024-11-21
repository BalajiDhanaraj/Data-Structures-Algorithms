    import java.util.*;
    import java.lang.*;
    import java.io.*;
    
    // The main method must be in a class named "Main".
    public class findMedianSortedArraysLTC {
      
    
    public static void main(String[] args) {
                //0,1,2,3,4,5,6,7,8,9,10
    int[] nums1 = {1,3};
    int[] nums2 = {2};
    
    double val = findMedianSortedArrays(nums1,nums2);
    System.out.println(val);

    }
    
   static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int count = 0;
        
        int[] nums3 = new int[nums1.length+nums2.length];
        
        for (int i=0;i<nums1.length;i++){
          nums3[i] += nums1[i];
          count++;
        } 
        
        for (int j=0;j<nums2.length;j++){
          nums3[count++] += nums2[j];
        } 
        
        
        
        Arrays.sort(nums3);
        
        
        int start = 0;
        int end = nums3.length-1;
        
        int mid = start + (end-start)/2;
        
        if(nums3.length%2==0){
          
        double mid1= nums3[mid];
        double mid2= nums3[mid+1];
        
        double avg = (mid1+mid2)/2;
        
        return avg;
          
        }else{
          
          return nums3[mid];
          
        }


    }
  
}
