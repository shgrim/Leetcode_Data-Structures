package Leetcode;

public class Leetcode114_BT {
    public static void main(String[] args) {

    }

    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            TreeNode temp = root.right;
            root.right = root.left;
            root.left = null;
            TreeNode current = root.right;
            while (current.right != null) {
                current = current.right;
            }
            current.right = temp;
        }
        flatten(root.right);
    }

    public class TreeNode {
        int val;
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
