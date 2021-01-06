public int maxTriple(int[] nums) {
  return Math.max(Math.max(nums[0], nums[nums.length / 2]), nums[nums.length - 1]);
}
