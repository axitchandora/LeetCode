class Solution:
    def deckRevealedIncreasing(self, deck: List[int]) -> List[int]:
        N = len(deck)
        result = [0] * N
        skip = False
        index_in_deck = 0
        index_in_result = 0

        deck.sort()

        while index_in_deck < N:
            if result[index_in_result] == 0:
                if not skip:
                    result[index_in_result] = deck[index_in_deck]
                    index_in_deck += 1
                skip = not skip
            index_in_result = (index_in_result + 1) % N

        return result