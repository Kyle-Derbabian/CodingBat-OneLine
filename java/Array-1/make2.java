public int[] make2(int[] a, int[] b) {
  return Arrays.copyOfRange(Arrays.stream(new int[][] {a, b}).flatMapToInt(Arrays::stream).toArray(), 0, 2);
}
