class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


def buildTree(nums):
    if not nums:
        return None
    root = TreeNode(nums[0])
    q = [root]
    i = 1
    while i < len(nums):
        curr = q.pop(0)
        if i < len(nums):
            curr.left = TreeNode(nums[i])
            q.append(curr.left)
            i += 1
        if i < len(nums):
            curr.right = TreeNode(nums[i])
            q.append(curr.right)
            i += 1
    return root


def printTree(node, level=0):
    if node != None:
        printTree(node.left, level + 1)
        print(' ' * 4 * level + '-> ' + str(node.val))
        printTree(node.right, level + 1)
