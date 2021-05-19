public boolean groupSum6(int start, int[] nums, int target) {
  return start >= nums.length ? target == 0 : groupSum6(start + 1, nums, target - nums[start] - (nums[start] == 6 ? 6 : 0)) || groupSum6(start + 1, nums, target - (nums[start] == 6 ? 6 : 0));
}
