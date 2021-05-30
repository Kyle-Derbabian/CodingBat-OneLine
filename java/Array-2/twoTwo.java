public boolean twoTwo(int[] nums) {
  return nums.length == 2 ? !(nums[0] == 2 ^ nums[1] == 2) : nums.length < 2 ? !(Arrays.binarySearch(nums, 2) > -1) : nums[0] == 2 && nums[1] != 2 ? false : twoTwo(Arrays.copyOfRange(nums, nums[0] == 2 && nums[2] != 2 ? 2 : 1, nums.length));
}
