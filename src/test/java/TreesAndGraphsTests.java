import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import treesAndGraphs.BinaryTreeLevelOrderTraversal;
import treesAndGraphs.MaximumDepthOfBinaryTree;
import treesAndGraphs.TreeNode;
import treesAndGraphs.ValidateBinarySearchTree;

import java.util.*;

public class TreesAndGraphsTests {

    TreeNode setupTree(Integer... array) {
        if (array.length == 0) {
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        TreeNode root = new TreeNode(array[0]);
        queue.offer(root);
        boolean left = true;

        for (int i = 1; i < array.length; i++) {
            TreeNode parent = queue.peek();

            if (array[i] != null) {
                TreeNode child = new TreeNode(array[i]);

                if (left) {
                    parent.left = child;
                } else {
                    parent.right = child;
                    queue.poll();
                }
                queue.offer(child);
            } else {
                if (!left) {
                    queue.poll();
                }
            }

            left = !left;
        }

        return root;
    }

    @Test
    void testMaximumDepthOfBinaryTree() {
        TreeNode root = setupTree(3, 9, 20, null, null, 15, 21);
        assertEquals(3, new MaximumDepthOfBinaryTree().maxDepth(root));

        root = null;
        assertEquals(0, new MaximumDepthOfBinaryTree().maxDepth(root));

        root = setupTree(5);
        assertEquals(1, new MaximumDepthOfBinaryTree().maxDepth(root));
    }

    @Test
    void testValidBinarySearchTree() {
        TreeNode root = setupTree(5,1,4,null,null,3,6);
        assertFalse(new ValidateBinarySearchTree().isValidBST(root));

        TreeNode root2 = setupTree(2, 1, 3);
        assertTrue(new ValidateBinarySearchTree().isValidBST(root2));
    }

    @Test
    void testBinaryTreeLevelOrderTraversal() {
        TreeNode root = setupTree(3,9,20,null,null,15,7);
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        list.add(Arrays.asList(3));
        list.add(Arrays.asList(9, 20));
        list.add(Arrays.asList(15, 7));
        assertEquals(list, new BinaryTreeLevelOrderTraversal().levelOrder(root));
    }

}
