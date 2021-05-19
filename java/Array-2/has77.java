public boolean has77(int[] nums) {
  return nums.length <= 2 ? nums == new int[] {7, 7} : nums.length == 3 ? nums[0] == 7 && nums[2] == 7 || nums[1] == 7 && nums[2] == 7 : nums[0] == 7 && (nums[1] == 7 || nums[2] == 7) || has77(Arrays.copyOfRange(nums, 1, nums.length));
}
