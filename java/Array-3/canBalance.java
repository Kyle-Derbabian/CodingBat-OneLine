public boolean canBalance(int[] nums) {
  return nums.length < 2 ? nums.length % 2 == 0 : nums[0] == java.util.stream.IntStream.of(nums).sum() - nums[0] ? true : canBalance(java.util.stream.Stream.concat(Arrays.asList(new Integer[] {nums[0] + nums[1]}).stream(), java.util.stream.IntStream.of(Arrays.copyOfRange(nums, 2, nums.length)).boxed().collect(Collectors.toList()).stream()).collect(Collectors.toList()).stream().mapToInt(i -> i).toArray());
}
