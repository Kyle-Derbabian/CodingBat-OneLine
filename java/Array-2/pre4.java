public int[] pre4(int[] nums) {
  return Arrays.copyOfRange(nums, 0, Arrays.stream(nums).boxed().collect(Collectors.toList()).indexOf(4));
}
