public boolean has22(int[] nums) {
  return nums.length >= 2 && (nums[0] == 2 && nums[1] == 2 || has22(Arrays.copyOfRange(nums, 1, nums.length)));
}
