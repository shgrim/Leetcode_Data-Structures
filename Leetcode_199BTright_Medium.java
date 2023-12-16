package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_199BTright_Medium {
    public static void main(String[] args) {

    }
        public List<Integer> rightSideView(TreeNode root) {
            List<Integer> ans = new ArrayList<>();
            dfs(root, 0, ans);
            return ans;
        }

        private void dfs(TreeNode root, int depth, List<Integer> ans) {
        int val= TreeNode.val;
            if (root == null)
                return;

            if (depth == ans.size())
                ans.add(root.val);
            dfs(root.right, depth + 1, ans);
            dfs(root.left, depth + 1, ans);
        }

    public static class TreeNode {
        static int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
