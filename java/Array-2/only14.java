public boolean only14(int[] nums) {
  return nums.length == 0 ? true : (nums[0] == 1 || nums[0] == 4) && only14(Arrays.copyOfRange(nums, 1, nums.length));
}
