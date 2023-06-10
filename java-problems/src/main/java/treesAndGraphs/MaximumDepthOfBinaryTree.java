package treesAndGraphs;


/**
 * @author Max DeMaio
 * Solved on 05/22/2022
 *
 * Maximum Depth of Binary Tree
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 * Difficulty: Easy
 *
 * Approach: For each node, we use recursion on its left and right nodes.
 * If we reach null, return 0
 * Basically you take the max of (left/right) and add 1
 * This way for each level of the binary tree we'll add each 1s up and get the depth
 *
 * Time Complexity: O(n) - we visit each node recursively
 * Space Complexity: O(n) - bc stack frames will equal the amount of nodes in the tree
 *
 */

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
