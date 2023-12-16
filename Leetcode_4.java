package Leetcode;
public class Leetcode_4 {
    public static void main(String[] args) {
        int[] nums1={1,2};
        int[] nums2={3,4};

        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        if(m > n) return findMedianSortedArrays(nums2, nums1);
        int k = (m + n + 1) / 2;
        int left = 0, right = m;
        while(left < right){
            int mid1 = left + (right - left) / 2;
            int mid2 = k - mid1;
            if(nums1[mid1] < nums2[mid2 - 1]) left = mid1 + 1;
            else right = mid1;
        }
        int mid1 = left;
        int mid2 = k - left;
        int c1 = Math.max(mid1 <= 0 ? Integer.MIN_VALUE: nums1[mid1 - 1],
                mid2 <= 0 ? Integer.MIN_VALUE: nums2[mid2 - 1]);
        if((m + n) % 2 != 0) return (double)c1;
        int c2 = Math.min(mid1 >= m ? Integer.MAX_VALUE: nums1[mid1],
                mid2 >= n ? Integer.MAX_VALUE: nums2[mid2]);
        return (c1 + c2) * 0.5;
    }
}
