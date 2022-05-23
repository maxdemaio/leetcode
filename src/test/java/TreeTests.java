import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import tree.MaximumDepthOfBinaryTree;
import tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class TreeTests {

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

}
