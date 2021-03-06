package treesAndGraphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Max DeMaio
 * Solved on 06/05/2022
 *
 * Binary Tree Level Order Traversal
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/94/trees/628/
 * Difficulty: Medium
 *
 * Approach: BFS
 * basically we use a queue
 * start with root node [[root]...]
 * if there's a left or right (another level), we add it to the queue to be processed
 * we add those values to a list and once the level is done we add that list to our
 * list of integer lists
 *
 *
 * Time Complexity: O(n) traverse all nodes
 * Space Complexity: O(n) we need a queue structure for all nodes
 */

/*
Quick note on DFS versus BFS:

DFS:
Depth-first search is an algorithm for traversing or searching
tree or graph data structures. The algorithm starts at the root node
and explores as far as possible along each branch before backtracking.

BFS:
Breadth-first search is an algorithm for searching
a tree data structure for a node that satisfies a given property.
It starts at the tree root and explores all nodes at the present
depth prior to moving on to the nodes at the next depth level.
 */
public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        // For BFS you always really need to think of a Queue
        // First one there, first one served like at McDonald's
        // Fist nodes in first ones to be added to the list
        // FIFO

        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);

        // do our processing
        // we have customers to serve, keep going until all gone
        while (!queue.isEmpty()) {
            int size = queue.size();

            // for each level make a list of all the nodes values
            List<Integer> currLevel = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.remove();
                currLevel.add(curr.val);
                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }
            result.add(currLevel);
        }

        return result;
    }
}
