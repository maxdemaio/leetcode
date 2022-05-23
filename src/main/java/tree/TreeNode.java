package tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        String s = "[";
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(this);

        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            if (curr != null) {
                s += curr.val + ",";
                queue.add(curr.left);
                queue.add(curr.right);
            } else {
                s += "null,";
            }
        }

        int lastIndex = s.length() - 1;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                lastIndex = i;
                break;
            }
        }

        return s.substring(0, lastIndex + 1) + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TreeNode)) {
            return false;
        }

        TreeNode other = (TreeNode) obj;
        return compare(this, other);
    }

    boolean compare(TreeNode t1, TreeNode t2) {
        if (t1 == t2) {
            return true;
        }
        if (t1 == null || t2 == null) {
            return false;
        }
        if (t1.val == t2.val && compare(t1.left, t2.left) && compare(t1.right, t2.right)) {
            return true;
        }
        return false;
    }
}

