public boolean arrayFront9(int[] nums) {
  return nums.length != 0 && (nums[nums.length - 1] == 9 && nums.length <= 4 || arrayFront9(Arrays.copyOfRange(nums, 0, nums.length - 1)));
}
