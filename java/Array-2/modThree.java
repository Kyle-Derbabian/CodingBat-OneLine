public boolean modThree(int[] nums) {
  return nums.length > 2 && (nums[0] % 2 == nums[1] % 2 && nums[1] % 2 == nums[2] % 2 || modThree(Arrays.copyOfRange(nums, 1, nums.length)));
}
