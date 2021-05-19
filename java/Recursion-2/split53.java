public boolean split53(int[] nums) {
  return helperMethod(0, nums, 0, 0);
}

public boolean helperMethod(int start, int[] nums, int sum1, int sum2) {
  return start >= nums.length ? sum1 == sum2 : nums[start] % 5 == 0 ? helperMethod(start + 1, nums, sum1 + nums[start], sum2) : nums[start] % 3 == 0 ? helperMethod(start + 1, nums, sum1, sum2 + nums[start]) : helperMethod(start + 1, nums, sum1 + nums[start], sum2) || helperMethod(start + 1, nums, sum1, sum2 + nums[start]);
}
