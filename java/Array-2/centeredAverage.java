public int centeredAverage(int[] nums) {
  return (Arrays.stream(nums).sum() - Arrays.stream(nums).max().getAsInt() - Arrays.stream(nums).min().getAsInt()) / (nums.length - 2);
}
