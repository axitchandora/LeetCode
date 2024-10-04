class Solution:
    def readBinaryWatch(self, turnedOn: int) -> List[str]:
        result = []
        for h in range(12):
            for m in range(60):
                hrBit = bin(h).count('1')
                minBit = bin(m).count('1')
                totalbit = hrBit + minBit
                
                if totalbit == turnedOn:
                    result.append(f"{h}:{m:02d}")
        return result
        