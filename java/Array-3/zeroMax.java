public int[] zeroMax(int[] nums) {
  return nums.length == 0 ? nums : java.util.stream.Stream.concat(Arrays.asList(nums[0] == 0 && Arrays.stream(Arrays.copyOfRange(nums, 1, nums.length)).filter(i -> i % 2 == 1).toArray().length > 0 ? new Integer[] {Arrays.stream(Arrays.copyOfRange(nums, 1, nums.length)).filter(i -> i % 2 == 1).max().getAsInt()} : new Integer[] {nums[0]}).stream(), Arrays.stream(zeroMax(Arrays.copyOfRange(nums, 1, nums.length))).boxed().collect(Collectors.toList()).stream()).collect(Collectors.toList()).stream().mapToInt(i -> i).toArray();
}
