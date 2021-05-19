public boolean groupSumClump(int start, int[] nums, int target) {
  if (start >= nums.length) {
    return target == 0;
  } else {
    if (start < nums.length - 1 && nums[start] == nums[start + 1]) {
      int lastIndex = start;
      while (lastIndex < nums.length && nums[++lastIndex] == nums[start]) {}
      return groupSumClump(lastIndex, nums, target - nums[start] * (lastIndex - start)) || groupSumClump(lastIndex, nums, target);
    } else {
      return groupSumClump(start + 1, nums, target - nums[start]) || groupSumClump(start + 1, nums, target);
    }
  }
}
