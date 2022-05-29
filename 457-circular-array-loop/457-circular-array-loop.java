class Solution {
    public boolean circularArrayLoop(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      boolean isForward = nums[i] >= 0; // if we are moving forward or not
      int slow = i, fast = i;

      // if slow or fast becomes '-1' this means we can't find cycle for this number
      do {
        slow = findNextIndex(nums, isForward, slow); // move one step for slow pointer
        fast = findNextIndex(nums, isForward, fast); // move one step for fast pointer
        if (fast != -1)
          fast = findNextIndex(nums, isForward, fast); // move another step for fast pointer
      } while (slow != -1 && fast != -1 && slow != fast);

      if (slow != -1 && slow == fast)
        return true;
    }

    return false;
  }

  private static int findNextIndex(int[] arr, boolean isForward, int currentIndex) {
    boolean direction = arr[currentIndex] >= 0;
    if (isForward != direction)
      return -1; // change in direction, return -1

    int nextIndex = (currentIndex + arr[currentIndex]) % arr.length;
    if (nextIndex < 0)
      nextIndex += arr.length; // wrap around for negative numbers

    // one element cycle, return -1 
    if (nextIndex == currentIndex)
      nextIndex = -1;

    return nextIndex;
  }
}