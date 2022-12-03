package treesAndGraphs;

public class SymmetricTree {

    public boolean isMirror(TreeNode leftSubTree, TreeNode rightSubtree) {
        // hit the end of the nodes
        if (leftSubTree == null || rightSubtree == null) {
            return leftSubTree == rightSubtree;
        }

        // check if equal
        if (leftSubTree.val != rightSubtree.val) {
            return false;
        }

        return isMirror(leftSubTree.left, rightSubtree.right);
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return isMirror(root.left, root.right);
    }
}
