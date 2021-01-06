public int arrayCount9(int[] nums) {
  return nums.length == 0 ? 0 : arrayCount9(Arrays.copyOfRange(nums, 1, nums.length)) + (nums[0] == 9 ? 1 : 0);
}
