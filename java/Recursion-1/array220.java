public boolean array220(int[] nums, int index) {
  return index < nums.length - 1 && (nums[index + 1] == nums[index] * 10 || array220(nums, index + 1));
}
