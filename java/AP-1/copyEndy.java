public int[] copyEndy(int[] nums, int count) {
  return Arrays.copyOfRange(Arrays.stream(nums).filter(x -> x >= 0 && x <= 10 || x >= 90 && x <= 100).toArray(), 0, count);
}
