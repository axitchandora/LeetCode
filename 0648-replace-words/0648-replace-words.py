class Solution:
    def replaceWords(self, dictionary: List[str], sentence: str) -> str:
        word_array = sentence.split()
        dict_set = set(dictionary)

        def shortest_root(word, dict_set):
            for i in range(len(word)):
                root = word[0:i]
                if root in dict_set:
                    return root
            return word

        for word in range(len(word_array)):
            word_array[word] = shortest_root(word_array[word], dict_set)

        return " ".join(word_array)