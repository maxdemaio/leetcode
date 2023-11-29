from trees.diameterofbinarytree import Solution
from trees.util import buildTree, printTree, TreeNode
from typing import *


def test_diameterofbinarytree():
    solution = Solution()

    # Test case 1
    nums = [4, -7, -3, None, None, -9, -3, 9, -7, -4, None, 6, None, -6, -6, None, None, 0, 6, 5, None, 9, None, None,
            -1, -4, None, None, None, -2]
    root: Optional[TreeNode] = buildTree(nums)
    printTree(root)
    expected = 8
    assert solution.diameterOfBinaryTree(root) == expected
