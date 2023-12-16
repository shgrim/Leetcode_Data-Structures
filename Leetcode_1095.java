/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Leetcode;

/**
 *
 * @author Adolf K Weismann
 */
public class Leetcode_1095 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    int search(int[]arr,int target)
    {
       int peak= peakIndexInMountainArray(arr);
       int firsttry = orderbinarysearch(arr,target,0,peak);
       if(firsttry!=-1)
           return firsttry;
       return orderbinarysearch(arr,target,peak+1,arr.length-1);
       
    }
    public int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
                }
        else{
            start = mid+1;}
        }
          return start;     
    }
    static int orderbinarysearch(int[] arr, int target, int start, int end)
    {
        boolean isasc = arr[start]<arr[end];
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(arr[mid]==target)
                return mid;
            if(isasc)
            {
            if(target>arr[mid])
            {
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;                
            }
        }
            else{
                if(target<arr[mid])
            {
                start=mid+1;
            }
            else if(target>arr[mid]){
                end=mid-1;                
            }  
            }
        }
            return -1;
    }
    
}
