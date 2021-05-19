public boolean either24(int[] nums) {
  return Collections.indexOfSubList(Arrays.asList(Arrays.stream(nums).boxed().toArray(Integer[]::new)), Arrays.asList(2, 2)) > -1 ^ Collections.indexOfSubList(Arrays.asList(Arrays.stream(nums).boxed().toArray(Integer[]::new)), Arrays.asList(4, 4)) > -1;
}
