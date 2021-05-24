public int[] post4(int[] nums) {
  return Arrays.copyOfRange(nums, Arrays.stream(nums).boxed().collect(Collectors.toList()).lastIndexOf(4) + 1, nums.length);
}
