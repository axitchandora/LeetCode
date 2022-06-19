class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] boxedArray = Arrays.stream(arr)
            .boxed().toArray(Integer[]::new);
        Arrays.sort(boxedArray,Comparator.comparingInt(Integer::bitCount)
                                  .thenComparingInt(Integer::valueOf));
        return Arrays.stream(boxedArray).mapToInt(Integer::intValue).toArray();
    }
}