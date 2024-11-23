class Solution:
    def interpret(self, command: str) -> str:
        res = ""
        i = 0
        while i < len(command):
            if command[i] == "G":
                res += "G"
            elif command[i] == "(" and command[i+1] == ")":
                res += "o"
                i += 1
            else:
                res += "al"
                i += 3
            i += 1
        return res
            