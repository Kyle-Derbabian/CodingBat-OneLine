public int[] tenRun(int[] nums) {
  return nums.length == 0 ? new int[0] : nums.length == 1 ? nums : nums[0] % 10 == 0 && nums[1] % 10 != 0 ? java.util.stream.Stream.concat(Arrays.stream(Arrays.copyOfRange(nums, 0, 1)).boxed().collect(Collectors.toList()).stream(), Arrays.stream(tenRun(Arrays.copyOfRange(java.util.stream.Stream.concat(Arrays.asList(new Integer[] {nums[0], nums[0]}).stream(), Arrays.stream(nums).boxed().collect(Collectors.toList()).subList(2, nums.length).stream()).collect(Collectors.toList()).stream().mapToInt(i -> i).toArray(), 1, nums.length))).boxed().collect(Collectors.toList()).stream()).collect(Collectors.toList()).stream().mapToInt(i -> i).toArray() : java.util.stream.Stream.concat(Arrays.stream(Arrays.copyOfRange(nums, 0, 1)).boxed().collect(Collectors.toList()).stream(), Arrays.stream(tenRun(Arrays.copyOfRange(nums, 1, nums.length))).boxed().collect(Collectors.toList()).stream()).collect(Collectors.toList()).stream().mapToInt(i -> i).toArray();
}
