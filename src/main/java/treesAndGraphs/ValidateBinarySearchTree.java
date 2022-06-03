package treesAndGraphs;

/**
 * @author Max DeMaio
 * Solved on 06/03/2022
 *
 * Validate Binary Search Tree
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/94/trees/625/
 * Difficulty: Medium
 *
 * Approach: DFS
 *
 * We must make sure the node being checked is within the min/max boundary
 * For checking left sides, we need to update the max boundary (cannot go over val)
 * For checking right sides, we need to update the min boundary (cannot be under val)
 *
 * Time Complexity: O(n) traverses every node
 * Space Complexity: O(n) need to have every node in the call stack
 *
 */

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        // edge case where tree is []
        if (root == null) {
            return true;
        }

        // we're assuming the BST needs to have ints
        // we just check if root is within (intMinVal > root < intMaxVal)
        return isValid(root, null, null);
    }

    boolean isValid(TreeNode node, Integer min, Integer max) {
        if (node == null) {
            return true;
        }

        // Check the node against our boundaries
        // Checking a node on the left
        if ((min != null && node.val <= min) || (max != null && node.val >= max)) {
            return false;
        }

        // update min and max
        // when going to the left side, we need to update the max value
        // when going to the right side, we need to update the min value
        return isValid(node.left, min, node.val) && isValid(node.right, node.val, max);
    }

}
