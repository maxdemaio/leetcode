from trees.util import TreeNode
from typing import *


class Solution:
    def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        if root is None:
            return

        # duplicate root node
        root2 = TreeNode()
        root2.val = root.val

        self.printNode(root)
        self.swapNodes(root, root2)
        return root2

    def printNode(self, node: Optional[TreeNode]):
        if node is None:
            return
        self.printNode(node.right)
        self.printNode(node.left)

    def swapNodes(self, node1: Optional[TreeNode], node2: Optional[TreeNode]):
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