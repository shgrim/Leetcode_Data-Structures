package Leetcode;

public class Leetcode_240SearchMatrix {
    public static void main(String[] args) {
        //int[][] a={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int [][] b={{1,1}};
        int target =2;
        System.out.println(searchMatrix(b,target));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int i = matrix.length - 1;
        int j = 0;
        while (i >= 0 && j < matrix[0].length) {
            if (matrix[i][j] > target) {
                i --;
            }
            else if (matrix[i][j] < target) {
                j ++;
            }
            else {
                return true;
            }
        }
        return false;
    }
}
