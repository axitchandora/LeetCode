class Solution:
    def convertDateToBinary(self, date: str) -> str:
        return "-".join([bin(int(n))[2:] for n in date.split("-")])
