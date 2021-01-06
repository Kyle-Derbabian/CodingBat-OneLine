public boolean has271(int[] nums) {
  return nums.length >= 3 && (nums[1] == nums[0] + 5 && (nums[2] == nums[0] - 1 || Math.abs(nums[2] - nums[0] + 1) <= 2) || has271(Arrays.copyOfRange(nums, 1, nums.length)));
}
