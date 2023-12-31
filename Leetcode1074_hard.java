package Leetcode;
import java.util.HashMap;
import java.util.Map;
public class Leetcode1074_hard {
    public static void main(String[] args) {
        int[][] matrix={{0,1,0},{1,1,1},{0,1,0}};
        int target =0;
        System.out.println(numSubmatrixSumTarget(matrix,target));
    }
    public static int numSubmatrixSumTarget(int[][] matrix, int target) {
        final int m = matrix.length;
        final int n = matrix[0].length;
        int ans = 0;

        // transfer each row of matrix to prefix sum
        for (int[] row : matrix)
            for (int i = 1; i < n; ++i)
                row[i] += row[i - 1];

        for (int baseCol = 0; baseCol < n; ++baseCol)
            for (int j = baseCol; j < n; ++j) {
                Map<Integer, Integer> prefixCount = new HashMap<>();
                prefixCount.put(0, 1);
                int sum = 0;
                for (int i = 0; i < m; ++i) {
                    if (baseCol > 0)
                        sum -= matrix[i][baseCol - 1];
                    sum += matrix[i][j];
                    ans += prefixCount.getOrDefault(sum - target, 0);
                    prefixCount.put(sum, prefixCount.getOrDefault(sum, 0) + 1);
                }
            }

        return ans;
    }
}
