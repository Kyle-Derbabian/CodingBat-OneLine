public boolean isEverywhere(int[] nums, int val) {
  return nums.length < 2 || ((nums[0] == val || nums[1] == val) && isEverywhere(Arrays.copyOfRange(nums, 1, nums.length), val));
}
