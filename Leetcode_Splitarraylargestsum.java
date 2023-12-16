/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Leetcode;

/**
 *
 * @author Adolf K Weismann
 */
public class Leetcode_Splitarraylargestsum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
        public int splitArray(int[] nums, int m) {
            int start=0;
            int end=0;
            for(int i=0;i<=nums.length-1;i++)
            {
                start=Math.max(start, nums[i]);
                end+=nums[i];
            }
            while(start<end)
            {
                int mid = start+(end-start)/2;
                int sum=0;
                int pieces=1;
                for(int num:nums){
                    if(sum+num>mid)
                    {
                        sum=num;
                        pieces++;
                    }
                else
                        sum+=num; 
            }
                if(pieces>m)
                {
                    start=mid+1;
                }
                else end=mid;
          }
            return end;
        
    }
    
}
