public int countEvens(int[] nums) {
  return Arrays.stream(nums).filter(n -> n % 2 == 0).toArray().length;
}
