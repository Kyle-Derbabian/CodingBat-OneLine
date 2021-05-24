public int[] shiftLeft(int[] nums) {
  return nums.length == 0 ? new int[] {} : java.util.stream.IntStream.concat(Arrays.stream(Arrays.copyOfRange(nums, 1, nums.length)), Arrays.stream(new int[] {nums[0]})).toArray();
}
