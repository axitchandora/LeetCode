class Solution:
    def checkTwoChessboards(self, coordinate1: str, coordinate2: str) -> bool:
        return ((ord(coordinate1[0])-ord('a')+ 1)+ ord(coordinate1[1]))%2 == (ord(coordinate2[0]) + ord(coordinate2[1]))%2