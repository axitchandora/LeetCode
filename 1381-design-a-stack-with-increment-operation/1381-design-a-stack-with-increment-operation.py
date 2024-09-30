class CustomStack:

    def __init__(self, maxSize: int):
        self.stack = []
        self.maxSize = maxSize
        self.increment_arr = [0] * maxSize

    def push(self, x: int) -> None:
        if len(self.stack) < self.maxSize:
            self.stack.append(x)

    def pop(self) -> int:
        if not self.stack:
            return -1
        index = len(self.stack) - 1
        inc_value = self.increment_arr[index]
        self.increment_arr[index] = 0
        if index > 0:
            self.increment_arr[index - 1] += inc_value
        return self.stack.pop() + inc_value

    def increment(self, k: int, val: int) -> None:
        limit = min(k, len(self.stack))
        if limit > 0:
            self.increment_arr[limit - 1] += val


# Your CustomStack object will be instantiated and called as such:
# obj = CustomStack(maxSize)
# obj.push(x)
# param_2 = obj.pop()
# obj.increment(k,val)