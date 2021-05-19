public boolean tripleUp(int[] nums) {
  return nums.length > 2 && (nums[2] == nums[1] + 1 && nums[1] == nums[0] + 1 || tripleUp(Arrays.copyOfRange(nums, 1, nums.length)));
}
