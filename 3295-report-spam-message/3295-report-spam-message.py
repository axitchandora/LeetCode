class Solution:
    def reportSpam(self, message: List[str], bannedWords: List[str]) -> bool:
        count = set(bannedWords)
        words = 0
        for mess in message:
            if mess in count:
                words += 1
            if words == 2:
                return True
        return False