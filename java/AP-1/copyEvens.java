public int[] copyEvens(int[] nums, int count) {
  return Arrays.copyOfRange(Arrays.stream(nums).filter(x -> x % 2 == 0).toArray(), 0, count);
}
