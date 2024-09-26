class MyCalendar:

    def __init__(self):
        self.events = [] # (s, e)

    def book(self, start: int, end: int) -> bool:
        for s, e in self.events:
            if e > start and end > s:
                return False
        self.events.append((start, end))
        return True
            


# Your MyCalendar object will be instantiated and called as such:
# obj = MyCalendar()
# param_1 = obj.book(start,end)