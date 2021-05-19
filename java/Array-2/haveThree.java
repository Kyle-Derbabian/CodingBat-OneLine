public boolean haveThree(int[] nums) {
  return Collections.frequency(Arrays.stream(nums).boxed().collect(Collectors.toList()), 3) == 3 && Collections.indexOfSubList(Arrays.stream(nums).boxed().collect(Collectors.toList()), Arrays.asList(3, 3)) < 0;
}
