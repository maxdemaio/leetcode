"""
Approach/Notes:
Use a stack of characters
When you encounter an opening bracket, push it to the top of the stack!
We will use this stack to compare against the closing parens

Ex1:

()[]{}
( then check
[ then check
{ then check

Ex2:
(())
(
(

Time complexity: O(n) to iterate over all chars once
Space complexity:
O(n) depending upon the type of string we get
like if it's all incorrect ((((( the stack would be the size of the input string
map is always constant though for ex2
"""

class Solution:
    def isValid(self, s: str) -> bool:
        if len(s) == 1:
            return False
        stack = []
        for char in s:
            if char == "(":
                stack.append(char)
            elif char == "{":
                stack.append(char)
            elif char == "[":
                stack.append(char)
            else:
                if len(stack) == 0:
                    return False
                corr = stack.pop()
                if char == ")" and corr != "(":
                    return False
                if char == "}" and corr != "{":
                    return False
                if char == "]" and corr != "[":
                    return False
        if len(stack) == 0:
            return True
        return False

    def isValidWithMapHelper(self, s: str) -> bool:
        map = {")": "(", "]": "[", "}": "{"}
        stack = []

        for c in s:
            # if it's an opening bracket, add to stack
            if c not in map:
                stack.append(c)
                continue
            # if stack is size 0, or it does not match
            if not stack or stack[-1] != map[c]:
                return False
            stack.pop()
        # stack should be empty if balanced
        return not stack
