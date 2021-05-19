public boolean no14(int[] nums) {
  return !Arrays.asList(Arrays.stream(nums).boxed().toArray(Integer[]::new)).contains(1) || !Arrays.asList(Arrays.stream(nums).boxed().toArray(Integer[]::new)).contains(4);
}
