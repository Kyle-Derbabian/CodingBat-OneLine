public boolean array123(int[] nums) {
  return nums.length >= 3 && (nums[0] == 1 && nums[1] == 2 && nums[2] == 3 || array123(Arrays.copyOfRange(nums, 1, nums.length)));
}
