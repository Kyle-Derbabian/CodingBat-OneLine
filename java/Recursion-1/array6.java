public boolean array6(int[] nums, int index) {
  return index < nums.length && (array6(nums, index + 1) || nums[index] == 6);
}
