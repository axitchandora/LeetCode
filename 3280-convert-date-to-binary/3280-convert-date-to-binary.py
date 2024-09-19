class Solution:
    def convertDateToBinary(self, date: str) -> str:
        return "-".join([bin(int(n)).replace("0b", "") for n in date.split("-")])
