public boolean splitOdd10(int[] nums) {
  return helperMethod(0, nums, 0, 0);
}

public boolean helperMethod(int start, int[] nums, int sum1, int sum2) {
  return start >= nums.length ? sum1 % 10 == 0 && sum2 % 2 == 1 || sum1 % 2 == 1 && sum2 % 10 == 0 : helperMethod(start + 1, nums, sum1 + nums[start], sum2) || helperMethod(start + 1, nums, sum1, sum2 + nums[start]);
}
