class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int n = arr.length;
        int[] countOfFrequencies = new int[n + 1];
        for (int count : map.values()) {
            countOfFrequencies[count]++;
        }

        int remainingUniqueElements = map.size();
        for (int i = 1; i <= n; i++) {
            int numElementsToRemove = Math.min(k / i, countOfFrequencies[i]);

            k -= (i * numElementsToRemove);

            remainingUniqueElements -= numElementsToRemove;

            if (k < i) {
                return remainingUniqueElements;
            }
        }

        return 0;
    }
}