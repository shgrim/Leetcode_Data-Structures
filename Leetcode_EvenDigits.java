//OPTIMIZED CODE
package Leetcode;

public class Leetcode_EvenDigits {
    
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num:nums )
        {
            if(even(num))
            {
                count ++;
                        }
            return count;
        }
        
        return count;
    }

    static boolean even(int num) {
        int numofdigits = digits(num);
        return numofdigits % 2 == 0;
    }
    
    static int digits(int num){
        return (int)(Math.log10(num))+1;
    }
}
