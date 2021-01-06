public boolean noTriples(int[] nums) {
  return nums.length < 3 || (nums[0] != nums[1] || nums[1] != nums[2]) && noTriples(Arrays.copyOfRange(nums, 1, nums.length));
}
