public int maxSpan(int[] nums) {
  return nums.length < 2 ? nums.length : Math.max(Arrays.stream(nums).boxed().collect(Collectors.toList()).lastIndexOf(nums[0]) + 1, maxSpan(Arrays.copyOfRange(nums, 1, nums.length)));
}
