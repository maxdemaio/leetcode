from typing import *

'''
Approach/Notes:
The trick is to use prefixes as postfixes
nums = [1,2,3,4]
prefixArray  =  [1, 1, 2, 6]
postfixArray = [24, 12, 4, 1]
The value at prefixArray[i] represents the cumulative product before nums[i]
The value at postfixArray[i] represents the cumulative product after nums[i]
When you multiply these two together, you get the product of all the elements except that element!

We can do two traversals with one array too. Basically just start with an array equal to the size of nums w/ 1s.
sol = [1,1,1,1]
(see productExceptSelf2)

You can do this with only one traversal if you calculate the postfix/prefix as you go
(see productExceptSelf method)

Time complexity: O(n)
Space complexity: O(1)

'''
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        length: int = len(nums)
        sol: List[int] = [1] * length  # array the same size as nums [1,1,1,...]
        pre: int = 1
        post: int = 1
        for i in range(length):
            sol[i] *= pre
            pre = pre * nums[i]
            sol[length-i-1] *= post
            post = post * nums[length-i-1]
        return sol
    def productExceptSelf2(self, nums: List[int]) -> List[int]:
        length: int = len(nums)
        sol: List[int] = [1] * length

        prefix: int = 1
        # traversal 1, create prefix
        for i in range(length):
            sol[i] *= prefix
            prefix *= nums[i]
        postfix: int = 1
        # traversal 2, create postfix
        for i in range(length):
            sol[length - 1 - i] *= postfix
            postfix *= nums[length - 1 - i]
        return sol
