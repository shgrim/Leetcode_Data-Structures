/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Leetcode;

/**
 *
 * @author Adolf K Weismann
 */
public class Leetcode_744 {
    public static void main(String[] args) {

    }
    static int ceiling(int[] letters, int target)
    {
        int start = 0;
        int end = letters.length;
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(target>letters[mid])
            {
                start=mid+1;
            }
            else
                end=mid-1;                
        }
        return letters[start%letters.length];
    }
}
