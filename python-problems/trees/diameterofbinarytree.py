from trees.util import TreeNode
from typing import *

class Solution:
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        self.sol = 0
        self.maxDepth(root)
        return self.sol

    def maxDepth(self, root: Optional[TreeNode]) -> int:
        if root is None:
            return 0
        leftDepth = self.maxDepth(root.left)
        rightDepth = self.maxDepth(root.right)
        self.sol = max(self.sol, leftDepth + rightDepth)
        # Whichever is higher, left subtree or right subtree and count curr node
        return max(leftDepth, rightDepth) + 1