from typing import Optional

from trees.util import buildTree, TreeNode


class Solution:
    def same(self, rootNode, subNode):
        # Both nodes are null, they are the same
        if rootNode is None and subNode is None:
            return True
        # Equal node values
        if rootNode and subNode and rootNode.val == subNode.val:
            # Recursively check if left and right subtrees are the same
            return self.same(rootNode.left, subNode.left) and self.same(rootNode.right, subNode.right)

        # If the values of the current nodes do not match, the trees are not the same
        return False


    def isSubtree(self, root: Optional[TreeNode], subRoot: Optional[TreeNode]) -> bool:
        # If subRoot is None, any tree matches it
        if subRoot is None:
            return True
        # If root is None, there are no nodes left to check so return False
        if root is None:
            return False
        # If the root and subtree match, return True
        if self.same(root, subRoot):
            return True
        # Recursively check if subRoot is a subtree of the left or right child of the current node
        return self.isSubtree(root.left, subRoot) or self.isSubtree(root.right, subRoot)




# run that shit
solution = Solution()

# Test case 1
rootList = [1,1]
subRootList = [1]
root: Optional[TreeNode] = buildTree(rootList)
subRoot: Optional[TreeNode] = buildTree(subRootList)
print("starting test 1")
expected = True
print("solution")
print(solution.isSubtree(root, subRoot))
