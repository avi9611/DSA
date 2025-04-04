/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        return dfs(root).lca;
    }

    private Pair dfs(TreeNode node) {
        if (node == null) return new Pair(null, 0);

        Pair left = dfs(node.left);
        Pair right = dfs(node.right);

        if (left.depth == right.depth) {
            return new Pair(node, left.depth + 1);
        } else if (left.depth > right.depth) {
            return new Pair(left.lca, left.depth + 1);
        } else {
            return new Pair(right.lca, right.depth + 1);
        }
    }

    private static class Pair {
        TreeNode lca;
        int depth;
        Pair(TreeNode lca, int depth) {
            this.lca = lca;
            this.depth = depth;
        }
    }
}
