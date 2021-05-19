public boolean more14(int[] nums) {
  return Arrays.stream(nums).filter(n -> n == 1).sum() > Arrays.stream(nums).filter(n -> n == 4).sum() / 4;
}
