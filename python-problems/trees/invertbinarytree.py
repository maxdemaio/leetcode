from trees.util import TreeNode
from typing import *

"""
Approach/Notes:
So we use post order traversal in which first we go in left subtree and then in right subtree 
Then we return back to parent node.
When we come back to the parent node we swap its left subtree and right subtree.

The naive approach creates an identical copy of the existing tree just inverted with the same method

Time complexity:
O(n) for both since we visit all nodes once

Space complexity:
Best approach - O(1) we update the nodes by just swapping them w/ a temp variable under the hood
Naive approach - O(n) since we make a copy of the tree
"""

class Solution:
    def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        if not root:  # Base Case
            return root
        self.invertTree(root.left)  # Call the left substree
        self.invertTree(root.right)  # Call the right substree
        # Swap the nodes
        root.left, root.right = root.right, root.left
        return root  # Return the root

    def invertTreeNaive(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        if root is None:
            return

        # duplicate root node
        root2 = TreeNode()
        root2.val = root.val

        self.printNode(root)
        self.swapNodes(root, root2)
        return root2

    def swapNodesNaive(self, node1: Optional[TreeNode], node2: Optional[TreeNode]):
        if node1 is None:
            return
        print("swapping lefts and rights: ", node1.val, node2.val)
        if node1.left is not None:
            node2.right = TreeNode()
            node2.right.val = node1.left.val
        if node1.right is not None:
            node2.left = TreeNode()
            node2.left.val = node1.right.val
        self.swapNodes(node1.right, node2.left)
        self.swapNodes(node1.left, node2.right)

    def printNode(self, node: Optional[TreeNode]):
        if node is None:
            return
        self.printNode(node.right)
        self.printNode(node.left)


