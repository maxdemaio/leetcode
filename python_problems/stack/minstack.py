class MinStack:

    def __init__(self):
        self.stack = []
        self.time = []
        ## push: 3, 8, 6, 7, 2, 4
        # [3]
        # [3, 8]
        # [3, 8, 6]
        # [3, 8, 6, 7]
        # [3, 8, 6, 7, 2]
        # [3, 8, 6, 7, 2, 4]

        ## time
        # [3, 3, 3, 3, 2, 2]

    def push(self, val: int) -> None:
        self.stack.append(val)
        if self.time:
            self.time.append(min(self.time[-1], val))
        else:
            self.time.append(val)

    def pop(self) -> None:
        self.stack.pop(-1)
        self.time.pop(-1)

    def top(self) -> int:
        return self.stack[-1]

    def getMin(self) -> int:
        return self.time[-1]
