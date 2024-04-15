class Solution:
    def maximalRectangle(self, matrix: List[List[str]]) -> int:
        def largestRectangleArea(heights):
            stack = []
            maxHeight = 0
            for i,h in enumerate(heights):
                start = i
                while stack and stack[-1][1] > h :
                    idx, hgt = stack.pop()
                    maxHeight = max(maxHeight, hgt*(i-idx))
                    start = idx
                stack.append((start,h))
            for i,h in stack:
                maxHeight = max(maxHeight, h*(len(heights)-i))            
            return maxHeight
            
        historgram = [[0 for j in range(len(matrix[0]))] for i in range(len(matrix))]
        for i in range(len(matrix)):
            for j in range(len(matrix[0])):
                if(matrix[i][j] == "1" and i == 0):
                    historgram[i][j] = 1 
                elif(matrix[i][j] == '1'):
                    historgram[i][j] = 1 + historgram[i-1][j]
                else:
                    historgram[i][j] = 0
        maxArea = 0
        for heights in historgram:
            maxArea = max(maxArea, largestRectangleArea(heights))
        return maxArea
        