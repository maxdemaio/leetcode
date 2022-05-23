package tree;

public class MaximumDepthOfBinaryTree {
    // runtime O(n) all nodes
    public int maxDepth(TreeNode root) {
        // base case (leaf node + 1)
        if (root == null) {
            return 0;
        }

        // ask child what depth we're at
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }
}
