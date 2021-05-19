public boolean groupSum5(int start, int[] nums, int target) {
  return start >= nums.length ? target == 0 : nums[start] % 5 == 0 ? groupSum5(start + (start < nums.length - 1 && nums[start + 1] == 1 ? 2 : 1), nums, target - nums[start]) : groupSum5(start + 1, nums, target - nums[start]) || groupSum5(start + 1, nums, target);
}
