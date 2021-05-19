public int sum13(int[] nums) {
  return nums.length == 0 ? 0 : nums.length == 1 ? nums[0] == 13 ? 0 : nums[0] : nums[0] == 13 ? 0 + sum13(Arrays.copyOfRange(nums, 2, nums.length)) : nums[0] + sum13(Arrays.copyOfRange(nums, 1, nums.length));
}
