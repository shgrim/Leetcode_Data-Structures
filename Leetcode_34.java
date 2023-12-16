/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Leetcode;

/**
 *
 * @author Adolf K Weismann
 */
public class Leetcode_34 {

   public int[] searchRange(int[] nums, int target)
   {
       int[] ans={-1,-1};
       int start=search(nums,target,true);
       int end=search(nums,target,false);
       ans[0]=start;
       ans[1]=end;

        return ans;

}
   int search(int[]nums, int target, boolean findindex)
   {
       int ans=-1;
       int start = 0;
       int end = nums.length-1;
       while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(target>nums[mid])
            {
                start=mid+1;
            }
            else if(target<nums[mid]){
                end=mid-1;                
            }
            else{
                ans=mid;
                if(findindex)
                end = mid-1;
                else{
                start = mid+1;}
            }
            }
        return ans;
   }
}
