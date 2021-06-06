public boolean splitOdd10(int[] nums) {
  return Arrays.stream(nums).filter(i -> i % 2 == 1 && i % 5 == 0).toArray().length % 2 != Arrays.stream(nums).filter(i -> i % 2 == 1 && i % 5 != 0).toArray().length % 2;
}
