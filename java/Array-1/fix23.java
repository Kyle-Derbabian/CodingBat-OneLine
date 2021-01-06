public int[] fix23(int[] nums) {
  return nums[0] == 2 && nums[1] == 3 ? new int[] {2, 0, nums[2]} : nums[1] == 2 && nums[2] == 3 ? new int[] {nums[0], 2, 0} : nums;
}
