public int array11(int[] nums, int index) {
  return index >= nums.length ? 0 : (nums[index] == 11 ? 1 : 0) + array11(nums, index + 1);
}
