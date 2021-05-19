public boolean sum28(int[] nums) {
  return Arrays.stream(nums).filter(n -> n == 2).sum() == 8;
}
