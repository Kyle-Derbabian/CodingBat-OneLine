public int[] fizzArray3(int start, int end) {
  return start == end ? new int[] {} : java.util.stream.IntStream.concat(Arrays.stream(new int[] {start}), Arrays.stream(fizzArray3(start + 1, end))).toArray();
}
